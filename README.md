# Exercise templates

This branch is **not** for learners. It contains the source from which the `starter` and `solutions` branches are generated,
so that each exercise is written once, and the two branches can never drift apart.

Learners should use the `starter` branch. See the README on `master`.

## Layout

```
templates/          The whole project, with the starter and solution code side by side
tools/gen.py        Generates the starter or solutions tree from the templates
tools/readmes.py    Generates the README for modules 1-15 from structured data
tools/build.sh      Runs both of the above
```

## Building the branches

You need Python 3, and Java 21 and Maven if you want to run the tests.

```
tools/build.sh out        # creates out/starter and out/solutions
(cd out/solutions && mvn test)    # everything should pass
(cd out/starter && mvn test-compile)    # everything should compile
```

To publish a change, copy the generated trees onto the `starter` and `solutions` branches
(for example with `rsync -a --delete --exclude .git --exclude target out/starter/ <checkout of starter>/`),
then commit and push each branch.

## Editing the exercises

Edit the files under `templates/`, **never** the generated branches.

Java files (and other text files) use these directives, each on a line of its own:

| Directive | Meaning |
|---|---|
| `//@@ solution` | The lines that follow appear only on the `solutions` branch |
| `//@@ starter` | The lines that follow appear only on the `starter` branch |
| `//@@ starter-commented` | The lines that follow are normal code on `solutions`, and are commented out on `starter` |
| `//@@ end` | Back to lines that appear on both branches |
| `//@@ only solution` / `//@@ only starter` | As the first line of a file: the file exists on that branch only |

Markdown files use `<!--@@ solution -->` and so on in the same way.

A typical exercise looks like this:

```java
@Test
void declaringAnInt() {
    // TODO: set the age to 42
//@@ solution
    int age = 42;
//@@ starter
    int age = 0;
//@@ end

    assertThat(age).isEqualTo(42);
}
```

### Guidelines

- The `starter` branch must always compile. If the learner has to create a class, use `starter-commented` for the test code
  that uses it, and add a `fail("TODO ...")` line.
- A starter test that is not finished should fail, not pass. Use a placeholder value that is wrong.
- The `solutions` branch must pass every test.
- The README of a module (modules 1-15) is generated from `tools/readmes.py`: edit the data there, and not
  `templates/exercises/module-NN-*/README.md`. The README for module 16 (the capstone brief) is written by hand.
- The README of the project (`templates/README.md`) is the README of both `starter` and `solutions`.
  The README of `master` is separate.
- Binary resources (such as `fruit-prices.xlsx`) are copied as they are.
