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
    

If using idea I recommend to set the FSC compiler in the project config. Recommends Latest IDEA 11.1+ and Scala and SBT plugin 

Requires
---------------

* [sbt](https://github.com/harrah/xsbt/wiki) 0.11.2 (does not work/compile with sbt 0.10.0) or earlier.
