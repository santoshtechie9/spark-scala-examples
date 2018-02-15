package com.techknowera.spark.sql

import org.apache.spark.{SparkConf, SparkContext}

object SQLContext {
  val conf =  new SparkConf().setMaster("local[1]").setAppName("Map Transformation");
  val sc = new SparkContext(conf);
  val sqlContext = new org.apache.spark.sql.SQLContext(sc)
  val df = sqlContext.read.json("api_log.json")
  df.schema.printTreeString()
  df.show()
}
