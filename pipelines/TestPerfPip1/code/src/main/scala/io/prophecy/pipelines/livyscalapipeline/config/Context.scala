package io.prophecy.pipelines.livyscalapipeline.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
