name := "assignment_akka"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test
)