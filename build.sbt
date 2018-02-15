name := "spark-examples"

version := "1.0"

scalaVersion := "2.11.5"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.1.1" % "provided"

// https://mvnrepository.com/artifact/com.typesafe/config
libraryDependencies += "com.typesafe" % "config" % "1.2.1"
