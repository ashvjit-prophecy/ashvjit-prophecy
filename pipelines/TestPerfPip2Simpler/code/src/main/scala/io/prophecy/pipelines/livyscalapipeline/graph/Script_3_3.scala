package io.prophecy.pipelines.livyscalapipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.config.Context
import io.prophecy.pipelines.livyscalapipeline.udfs.UDFs._
import io.prophecy.pipelines.livyscalapipeline.udfs.PipelineInitCode._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Script_3_3 {
  def apply(context: Context, in0: DataFrame): DataFrame = {
    val spark = context.spark
    val Config = context.config
    // val spark1  = context.spark
    val config = context.config
    print("hello")
    assert(config.c_string == "test_instance_1")
    assert(config.c_string_default_value_dont_change == "default_value")
    config.c_string = "new_updated_string_value"
    val out0 = in0
    out0
    in0
  }

}
