package io.prophecy.pipelines.testbasicpipelinejob.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
