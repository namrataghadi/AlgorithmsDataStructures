version := "1.0"
scalaVersion := "2.11.7"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.3"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.5.1"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.5.1"

unmanagedBase <<= baseDirectory{base => base / "lib"}

unmanagedJars in Compile += file("lib/JavaPlot.jar")
unmanagedJars in Compile += file("lib/sparkts.jar")

