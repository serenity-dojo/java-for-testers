#!/usr/bin/env bash
# Builds the starter and solutions trees from the templates.
# Usage: tools/build.sh [OUTPUT_DIR]      (default: out)
set -euo pipefail
cd "$(dirname "$0")/.."
OUT="${1:-out}"

# Regenerate the module READMEs (modules 1-15; module 16 is written by hand)
python3 tools/readmes.py templates/exercises

rm -rf "$OUT/starter" "$OUT/solutions"
python3 tools/gen.py templates "$OUT/starter" starter
python3 tools/gen.py templates "$OUT/solutions" solutions
echo "Generated $OUT/starter and $OUT/solutions"
