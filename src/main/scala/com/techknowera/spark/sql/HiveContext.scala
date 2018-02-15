package com.techknowera.spark.sql

import com.techknowera.spark.sql.SQLContext.sqlContext
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql

object HiveContext extends App {

  val conf =  new SparkConf().setMaster("local[1]").setAppName("Hive Context");
  val sc = new SparkContext(conf);

  val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
  val dfHive = sqlContext.read.json("api_log.json")
  dfHive.schema.printTreeString()
  dfHive.show()
}
