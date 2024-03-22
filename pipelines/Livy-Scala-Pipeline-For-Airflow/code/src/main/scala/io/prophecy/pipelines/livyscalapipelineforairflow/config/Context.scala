package io.prophecy.pipelines.livyscalapipelineforairflow.config

import org.apache.spark.sql.SparkSession
case class Context(spark: SparkSession, config: Config)
