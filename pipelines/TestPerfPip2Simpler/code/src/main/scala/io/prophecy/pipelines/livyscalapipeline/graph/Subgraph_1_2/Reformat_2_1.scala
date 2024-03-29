package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_2

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_2.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Reformat_2_1 {

  def apply(context: Context, in: DataFrame): DataFrame = {
    val Config = context.config
    in.select(
      col("year"),
      col("industry_code_ANZSIC"),
      col("industry_name_ANZSIC"),
      col("rme_size_grp"),
      col("variable"),
      col("value"),
      col("unit"),
      concat(
        lit(Config.c_int),
        lit(Config.c_string),
        lit(Config.c_sg_string),
        lit(Config.c_sg_array(0)),
        lit(Config.c_sg_record.csgr_boolean),
        lit(Config.c_sg_record.csgr_int)
      ).as("c_configs"),
      lookup("LookupTest1", col("variable"), col("unit"))
        .getField("value")
        .as("c_lookup")
    )
  }

}
