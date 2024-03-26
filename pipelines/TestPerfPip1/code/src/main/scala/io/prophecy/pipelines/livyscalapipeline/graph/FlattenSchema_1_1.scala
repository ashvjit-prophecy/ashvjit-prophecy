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

object FlattenSchema_1_1 {

  def apply(context: Context, in: DataFrame): DataFrame = {
    val flattened = in
      .withColumn("c_array_int",    explode_outer(col("c_array_int")))
      .withColumn("c_array_string", explode_outer(col("c_array_string")))
    flattened.select(
      if (flattened.columns.contains("c_array_int")) col("c_array_int")
      else col("c_array_int"),
      if (flattened.columns.contains("c_array_string")) col("c_array_string")
      else col("c_array_string"),
      if (flattened.columns.contains("year")) col("year") else col("year"),
      if (flattened.columns.contains("industry_code_ANZSIC"))
        col("industry_code_ANZSIC")
      else col("industry_code_ANZSIC"),
      if (flattened.columns.contains("industry_name_ANZSIC"))
        col("industry_name_ANZSIC")
      else col("industry_name_ANZSIC"),
      if (flattened.columns.contains("rme_size_grp")) col("rme_size_grp")
      else col("rme_size_grp"),
      if (flattened.columns.contains("variable")) col("variable")
      else col("variable"),
      if (flattened.columns.contains("value")) col("value") else col("value"),
      if (flattened.columns.contains("unit")) col("unit") else col("unit"),
      if (flattened.columns.contains("c- short")) col("c- short")
      else col("c- short")
    )
  }

}
