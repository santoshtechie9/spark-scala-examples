package com.techknowera.spark.rdd

import com.techknowera.spark.app.InitializeSparkContext
import com.typesafe.config.ConfigFactory
import org.apache.spark.SparkContext

object SparkDataFormats {
  def main(args: Array[String]): Unit = {

    // the spark context is initialized in the app package
    val sc = InitializeSparkContext.createSparkContext()
    val projConf = ConfigFactory.load()

    //println("properties = " + projConf.getString("sparkAppConf.textInputFile"))

    //create an rdd from a text file
    println("text Input File")
    sc.textFile(projConf.getString("sparkAppConf.textInputFile")).take(3).foreach(line => println(line))

    //Create and rdd from maprfs filesystem
    println("maprfs Input File")
    sc.textFile(projConf.getString("sparkAppConf.maprfsInputFile")).take(3).foreach(line => println(line))

    // local filesystem

    //Create an rdd from JSON File
    //sc.textFile(projConf.getString("jsonInputFile"))

    //wholeTextFile
    //sequenceFile
    //hadoopRDD
    //objectFile
    //Parquet File

   }
}
