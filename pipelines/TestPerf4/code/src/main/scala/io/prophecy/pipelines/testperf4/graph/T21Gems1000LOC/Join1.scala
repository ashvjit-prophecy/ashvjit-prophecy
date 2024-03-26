package io.prophecy.pipelines.testperf4.graph.T21Gems1000LOC

import io.prophecy.libs._
import io.prophecy.pipelines.testperf4.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperf4.udfs.UDFs._
import io.prophecy.pipelines.testperf4.graph.T21Gems1000LOC.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Join1 {

  def apply(context: Context, in0: DataFrame, in1: DataFrame): DataFrame =
    in0
      .as("in0")
      .join(in1.as("in1"),
            col("in0.industry_code_ANZSIC") =!= col("in1.industry_code_ANZSIC"),
            "inner"
      )
      .where(col("in0.year").isNotNull.and(col("in1.year").isNotNull))
      .select(
        col("in0.year").as("year"),
        col("in0.industry_code_ANZSIC").as("industry_code_ANZSIC"),
        col("in1.industry_name_ANZSIC").as("industry_name_ANZSIC"),
        col("in0.rme_size_grp").as("rme_size_grp"),
        col("in0.variable").as("variable"),
        col("in0.value").as("value"),
        col("in0.unit").as("unit")
      )

}
