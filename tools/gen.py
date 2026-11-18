#!/usr/bin/env python3
"""
Generate the 'starter' or 'solutions' tree from the shared exercise templates.

Directives (a whole line, in Java as //@@ ..., in Markdown as <!--@@ ... -->):
  //@@ solution          lines until the next directive are emitted only in the solutions tree
  //@@ starter           lines until the next directive are emitted only in the starter tree
  //@@ starter-commented lines are emitted as-is in solutions, and commented out in starter
  //@@ end               back to common lines
  //@@ only solution|starter   (first line of a file) the file exists in that tree only
"""
import re, shutil, sys
from pathlib import Path

DIRECTIVE = re.compile(r'^\s*(?://|<!--)\s*@@\s*([\w-]+)(?:\s+(\w+))?\s*(?:-->)?\s*$')


def render(text, mode):
    out, state = [], 'common'
    for line in text.split('\n'):
        m = DIRECTIVE.match(line)
        if m:
            d = m.group(1)
            if d == 'only':
                continue
            if d == 'end':
                state = 'common'
            elif d in ('solution', 'starter', 'starter-commented'):
                state = d
            else:
                raise SystemExit(f'unknown directive: {line!r}')
            continue
        if state == 'common':
            out.append(line)
        elif state == 'solution' and mode == 'solutions':
            out.append(line)
        elif state == 'starter' and mode == 'starter':
            out.append(line)
        elif state == 'starter-commented':
            if mode == 'solutions' or not line.strip():
                out.append(line)
            else:
                indent = len(line) - len(line.lstrip())
                out.append(line[:indent] + '// ' + line[indent:])
    return '\n'.join(out)


def main(tpl, dest, mode):
    tpl, dest = Path(tpl), Path(dest)
    for src in sorted(tpl.rglob('*')):
        if src.is_dir() or src.name == '.DS_Store':
            continue
        rel = src.relative_to(tpl)
        target = dest / rel
        target.parent.mkdir(parents=True, exist_ok=True)
        try:
            text = src.read_text(encoding='utf-8')
        except UnicodeDecodeError:
            shutil.copyfile(src, target)
            continue
        first = text.split('\n', 1)[0]
        m = DIRECTIVE.match(first)
        if m and m.group(1) == 'only' and m.group(2) != ('solution' if mode == 'solutions' else 'starter'):
            continue
        target.write_text(render(text, mode), encoding='utf-8')


if __name__ == '__main__':
    if len(sys.argv) != 4 or sys.argv[3] not in ('starter', 'solutions'):
        raise SystemExit('usage: gen.py TEMPLATE_DIR DEST_DIR starter|solutions')
    main(*sys.argv[1:])
