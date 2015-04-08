This repository demonstrates https://github.com/scoverage/scalac-scoverage-plugin/issues/27

Run:
    sbt scoverage:test

Then open `target/scala-2.11/scoverage-report/index.html`

Notice that the "$anon" class is shown as 50% covered 
(arguably correct, since `Class2.$anon` is not covered by tests), 
but that the link on the report goes to `Class1`
