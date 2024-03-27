package io.prophecy.pipelines.livysmallpipeline.graph.sg100gems_1

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.udfs.UDFs._
import io.prophecy.pipelines.livysmallpipeline.graph.sg100gems_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object OrderBy_1_1_2_2 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.orderBy(col("industry_code_ANZSIC").asc,
               col("industry_name_ANZSIC").desc
    )

}
