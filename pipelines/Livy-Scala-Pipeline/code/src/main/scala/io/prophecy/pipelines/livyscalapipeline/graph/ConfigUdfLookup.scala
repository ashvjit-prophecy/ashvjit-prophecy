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

object ConfigUdfLookup {

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
      lookup("LookupTest", col("variable"))
        .getField("value")
        .as("c_lookup_call"),
      concat(udf_string_null_safe(col("value")), col("industry_code_ANZSIC"))
        .as("c_udf_call"),
      (udf_multiply(lit(2)) * udf_string_length(
        col("rme_size_grp")
      ) * udf_divide_total(lit(2))).as("c_udf_call1"),
      concat(
        lit(Config.c_string),
        lit(Config.c_int),
        lit(Config.c_long),
        lit(Config.c_array(0).car_string),
        lit(Config.c_record.cr_array_string(0)),
        lit(Config.c_record.cr_boolean)
      ).as("c_configs")
    )
  }

}
