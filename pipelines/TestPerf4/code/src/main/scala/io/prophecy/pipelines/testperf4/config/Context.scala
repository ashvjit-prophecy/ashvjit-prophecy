package io.prophecy.pipelines.testperf4.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)