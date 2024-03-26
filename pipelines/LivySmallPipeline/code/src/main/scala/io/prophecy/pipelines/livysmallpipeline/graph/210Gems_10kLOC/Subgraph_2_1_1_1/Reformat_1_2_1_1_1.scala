package io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.udfs.UDFs._
import io.prophecy.pipelines.livysmallpipeline.graph.`210Gems_10kLOC`.Subgraph_2_1_1_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Reformat_1_2_1_1_1 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.select(
      col("year"),
      col("industry_code_ANZSIC"),
      col("industry_name_ANZSIC"),
      col("rme_size_grp"),
      col("variable"),
      col("value"),
      col("unit"),
      col("year").as("year1"),
      col("industry_code_ANZSIC").as("industry_code_ANZSIC1"),
      col("industry_name_ANZSIC").as("industry_name_ANZSIC1"),
      col("rme_size_grp").as("rme_size_grp1"),
      col("variable").as("variable1"),
      col("value").as("value1"),
      col("unit").as("unit1"),
      col("year").as("year2"),
      col("industry_code_ANZSIC").as("industry_code_ANZSIC2"),
      col("industry_name_ANZSIC").as("industry_name_ANZSIC2"),
      col("rme_size_grp").as("rme_size_grp2"),
      col("variable").as("variable2"),
      col("value").as("value2"),
      col("unit").as("unit2"),
      col("year").as("year3"),
      col("industry_code_ANZSIC").as("industry_code_ANZSIC3"),
      col("industry_name_ANZSIC").as("industry_name_ANZSIC3"),
      col("rme_size_grp").as("rme_size_grp3"),
      col("variable").as("variable3"),
      col("value").as("value3"),
      col("unit").as("unit3"),
      col("year").as("year4"),
      col("industry_code_ANZSIC").as("industry_code_ANZSIC4"),
      col("industry_name_ANZSIC").as("industry_name_ANZSIC4"),
      col("rme_size_grp").as("rme_size_grp4"),
      col("variable").as("variable4"),
      col("value").as("value4"),
      col("unit").as("unit4")
    )

}
