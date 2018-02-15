package com.techknowera.scala.sql

import org.apache.spark.sql.SparkSession


object Datasets {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("Datasets example").getOrCreate()
    import spark.implicits._
    val logFile = spark.read.textFile("api_log.dat")
    val numDec = logFile.filter(line => line.contains("DEC")).count
    println(s"lines with DEC : $numDec")

    spark.stop()

  }

}
