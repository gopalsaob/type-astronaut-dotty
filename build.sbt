ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "type-astronaut-dotty"
  )

libraryDependencies += "org.typelevel" %% "shapeless3-deriving" % "3.1.0"
libraryDependencies += "org.typelevel" %% "shapeless3-typeable" % "3.1.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % Test
