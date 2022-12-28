ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Scala-test"
  )
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.7.0"