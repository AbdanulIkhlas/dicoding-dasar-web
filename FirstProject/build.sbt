ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "FirstProject",
    // https://mvnrepository.com/artifact/com.typesafe.play/play-json
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.10.6"
  )
