This repository demonstrates https://github.com/scoverage/scalac-scoverage-plugin/issues/27

Run:

    sbt clean coverage test

Then open `target/scala-2.11/scoverage-report/index.html`

Notice that there is only one "Helper" class listed, and it is listed with 50% coverage.
In fact, there should be two Helper classes, one with 100% coverage and one with 0% coverage.
