package io.prophecy.pipelines.livysmallpipeline.graph.Subgraph_1.Subgraph_2

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallpipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livysmallpipeline.udfs.UDFs._
import io.prophecy.pipelines.livysmallpipeline.graph.Subgraph_1.Subgraph_2.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object OrderBy_1_1 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.orderBy(
      col("year").asc,
      col("industry_code_ANZSIC").desc,
      col("year").asc,
      col("industry_code_ANZSIC").asc,
      col("industry_name_ANZSIC").asc,
      col("rme_size_grp").asc,
      col("variable").asc,
      col("value").asc,
      col("unit").asc,
      col("year1").asc,
      col("industry_code_ANZSIC1").asc,
      col("industry_name_ANZSIC1").asc,
      col("rme_size_grp1").asc,
      col("variable1").asc,
      col("value1").asc,
      col("unit1").asc,
      col("year2").asc,
      col("industry_code_ANZSIC2").asc,
      col("industry_name_ANZSIC2").asc,
      col("rme_size_grp2").asc,
      col("variable2").asc,
      col("value2").asc,
      col("unit2").asc,
      col("year3").asc,
      col("industry_code_ANZSIC3").asc,
      col("industry_name_ANZSIC3").asc,
      col("rme_size_grp3").asc,
      col("variable3").asc,
      col("value3").asc,
      col("unit3").asc,
      col("year4").asc,
      col("industry_code_ANZSIC4").asc,
      col("industry_name_ANZSIC4").asc,
      col("rme_size_grp4").asc,
      col("variable4").asc,
      col("value4").asc,
      col("unit4").asc
    )

}
