package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object SchemaTransform_1 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.withColumn("year_new1", concat(col("year"), lit("1")))
      .drop("unit")
      .withColumnRenamed("industry_code_ANZSIC", "industry_code_ANZSIC_1")
      .withColumn("year_new2",                   concat(col("year"), lit("2")))

}
