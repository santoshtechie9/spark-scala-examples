package com.techknowera.spark.RDD

import com.typesafe.config.ConfigFactory
import org.apache.spark.{SparkConf, SparkContext}

object RddCreation {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Parallize Collection")
    val sc = new SparkContext(conf)
    val projConf = ConfigFactory.load()

    // Parallalize an existing collection
    val intArray = Array(1,2,3,4,5,6,7,8,9)
    val distData = sc.parallelize(intArray)

    //to set the partitions manually
    val distData1 = sc.parallelize(intArray,2)

    //create an rdd from a external data set
    println("text Input File")
    sc.textFile(projConf.getString("sparkAppConf.textInputFile")).take(3).foreach(line => println(line))

    //create an rdd from a external data set and set partitions manually
    val logFile = sc.textFile("maprfs:///api_log.dat2")

  }
}
