package com.techknowera.spark.rdd

import com.typesafe.config.ConfigFactory
import org.apache.spark.{SparkConf, SparkContext}

object Count {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Count Spark")
    val sc = new SparkContext(conf)
    val projConfig = ConfigFactory.load()

    val logFile = sc.textFile(projConfig.getString("sparkAppConf.largeInputDataset"))
    val numDec = logFile.filter(line => line.contains("plant_enr")).count()
    println(s"lines with DEC : $numDec")

  }

}
