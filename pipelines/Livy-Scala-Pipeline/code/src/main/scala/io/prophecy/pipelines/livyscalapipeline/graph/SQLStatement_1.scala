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

object SQLStatement_1 {

  def apply(context: Context, in0: DataFrame, in1: DataFrame): DataFrame = {
    in0.createOrReplaceTempView("in0")
    in1.createOrReplaceTempView("in1")
    context.spark.sql(
      "select * from in0 where in0.c_array_int!= (select count(*) from in1)"
    )
  }

}
