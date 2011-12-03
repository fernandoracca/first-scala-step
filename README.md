First Scala Step
------------

This project aims to simplify creating a project from scratch:

It provides:

     Scala 2.9.1
     SBT 0.11.2
     Specs2 1.6
     Mockito 1.8.5
     Eclipse
     IntelliJ IDEA

Use
---------------
Clone and update the project name from build.sbt

    git clone git://github.com/fractal/first-scala-step.git my-project
    cd my-project
    vi build-sbt # change name to my-project
    sbt
    test
    eclipse
    gen-idea
    

If using idea I recommend to set the FSC compiler in the project config. Requires Latest IDEA 10.5.2 and Scala and SBT plugin (will only work with latest SBT)

Requires
---------------

* [sbt](https://github.com/harrah/xsbt/wiki) 0.11.2 (does not work/compile with sbt 0.10.0) or earlier.