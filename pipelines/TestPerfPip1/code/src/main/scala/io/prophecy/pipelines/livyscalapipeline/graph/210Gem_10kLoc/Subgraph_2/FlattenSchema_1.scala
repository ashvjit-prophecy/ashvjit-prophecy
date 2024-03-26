package io.prophecy.pipelines.livyscalapipeline.graph.`210Gem_10kLoc`.Subgraph_2

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.graph.`210Gem_10kLoc`.Subgraph_2.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object FlattenSchema_1 {

  def apply(context: Context, in: DataFrame): DataFrame =
    in.select(
      if (in.columns.contains("year")) col("year") else col("year"),
      if (in.columns.contains("industry_code_ANZSIC"))
        col("industry_code_ANZSIC")
      else col("industry_code_ANZSIC"),
      if (in.columns.contains("industry_name_ANZSIC"))
        col("industry_name_ANZSIC")
      else col("industry_name_ANZSIC"),
      if (in.columns.contains("rme_size_grp")) col("rme_size_grp")
      else col("rme_size_grp"),
      if (in.columns.contains("variable")) col("variable") else col("variable"),
      if (in.columns.contains("value")) col("value") else col("value"),
      if (in.columns.contains("unit")) col("unit") else col("unit"),
      if (in.columns.contains("year1")) col("year1") else col("year1"),
      if (in.columns.contains("industry_code_ANZSIC1"))
        col("industry_code_ANZSIC1")
      else col("industry_code_ANZSIC1"),
      if (in.columns.contains("industry_name_ANZSIC1"))
        col("industry_name_ANZSIC1")
      else col("industry_name_ANZSIC1"),
      if (in.columns.contains("rme_size_grp1")) col("rme_size_grp1")
      else col("rme_size_grp1"),
      if (in.columns.contains("variable1")) col("variable1")
      else col("variable1"),
      if (in.columns.contains("value1")) col("value1") else col("value1"),
      if (in.columns.contains("unit1")) col("unit1") else col("unit1"),
      if (in.columns.contains("year2")) col("year2") else col("year2"),
      if (in.columns.contains("industry_code_ANZSIC2"))
        col("industry_code_ANZSIC2")
      else col("industry_code_ANZSIC2"),
      if (in.columns.contains("industry_name_ANZSIC2"))
        col("industry_name_ANZSIC2")
      else col("industry_name_ANZSIC2"),
      if (in.columns.contains("rme_size_grp2")) col("rme_size_grp2")
      else col("rme_size_grp2"),
      if (in.columns.contains("variable2")) col("variable2")
      else col("variable2"),
      if (in.columns.contains("value2")) col("value2") else col("value2"),
      if (in.columns.contains("unit2")) col("unit2") else col("unit2"),
      if (in.columns.contains("year3")) col("year3") else col("year3"),
      if (in.columns.contains("industry_code_ANZSIC3"))
        col("industry_code_ANZSIC3")
      else col("industry_code_ANZSIC3"),
      if (in.columns.contains("industry_name_ANZSIC3"))
        col("industry_name_ANZSIC3")
      else col("industry_name_ANZSIC3"),
      if (in.columns.contains("rme_size_grp3")) col("rme_size_grp3")
      else col("rme_size_grp3"),
      if (in.columns.contains("variable3")) col("variable3")
      else col("variable3"),
      if (in.columns.contains("value3")) col("value3") else col("value3"),
      if (in.columns.contains("unit3")) col("unit3") else col("unit3"),
      if (in.columns.contains("year4")) col("year4") else col("year4"),
      if (in.columns.contains("industry_code_ANZSIC4"))
        col("industry_code_ANZSIC4")
      else col("industry_code_ANZSIC4"),
      if (in.columns.contains("industry_name_ANZSIC4"))
        col("industry_name_ANZSIC4")
      else col("industry_name_ANZSIC4"),
      if (in.columns.contains("rme_size_grp4")) col("rme_size_grp4")
      else col("rme_size_grp4"),
      if (in.columns.contains("variable4")) col("variable4")
      else col("variable4"),
      if (in.columns.contains("value4")) col("value4") else col("value4"),
      if (in.columns.contains("unit4")) col("unit4") else col("unit4")
    )

}
