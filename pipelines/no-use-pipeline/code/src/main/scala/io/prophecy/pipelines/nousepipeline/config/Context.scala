package io.prophecy.pipelines.nousepipeline.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
