package io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_1

import io.prophecy.libs._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.UDFs._
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_1.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object Limit_1_1_1_2_2_1_2 {
  def apply(context: Context, in: DataFrame): DataFrame = in.limit(10)
}