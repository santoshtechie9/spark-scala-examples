package com.techknowera.spark.apps

/**
  * Created by santo on 11/26/2017.
  */

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object MyFirstScalaProgram extends App {

  val appName = "TechKnow"
  val sparkMasterURL = "local[2]"

  //create a configuration object
  val conf = new SparkConf().setMaster(sparkMasterURL).setAppName(appName).set("spark.executor.memory","2g")

  //spark context
  val sc = new SparkContext(conf)

  //load data file into RDD
  val tweetsRDD = sc.textFile("C:\\Users\\santo\\workspace-intellij\\spark-scala-sbt\\src\\main\\resources\\movietweets.csv")

  //print first five lines
  for(tweet <- tweetsRDD.take(5)) println(tweet)

  //print total number of lines
  println("Total number of line =" + tweetsRDD.count())

  //convert tweets to upper
  val tweetsUpper = tweetsRDD.map(s => s.toUpperCase())

  for(tweet <- tweetsUpper.take(5)) println(tweet)
  //tweetsUpper.take(5)
}
