package io.prophecy.pipelines.livybenchmarkpipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livybenchmarkpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livybenchmarkpipeline.udfs.UDFs._
import io.prophecy.pipelines.livybenchmarkpipeline.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Reformat_1_1_4_5_1_1_1_1_1 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.select(col("year"),
              col("industry_code_ANZSIC"),
              col("industry_name_ANZSIC"),
              col("rme_size_grp"),
              col("variable"),
              col("value"),
              col("unit")
    )

}
