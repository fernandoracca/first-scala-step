First Scala Step
------------

This project aims to simplify creating a project from scratch.It's easier than g8 because it doesn't require any additional tools, just clone, build and run.
It provides:

     Scala 2.9.1
     SBT 0.11.2
     Specs2 1.9
     Mockito 1.9
     IntelliJ IDEA
     Scala-IDE 2.0
     [SBT-man](https://github.com/sbt/sbt-man) - Extremely handy Scaladoc info from your shell! 

Use
---------------
Clone and update the project name from build.sbt

    git clone git://github.com/fractal/first-scala-step.git my-project
    cd my-project
    vi build-sbt # change name to my-project
    sbt
    test
    gen-idea
    eclipse

Requires
---------------
* [sba 0.11.2](https://github.com/harrah/xsbt/wiki) (does not work/compile with sbt 0.10.0) or earlier.

Recommends
---------------
* Latest IDEA 11.1+ and Scala and SBT plugin
* Set the FSC compiler in the project config
