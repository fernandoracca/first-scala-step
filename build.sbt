name := "first-scala-step"

organization := "uk.co.fluidlabs"

version := "1.3"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.9" % "test",
    "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test",
    "org.mockito" % "mockito-all" % "1.9.0" % "test"
)
