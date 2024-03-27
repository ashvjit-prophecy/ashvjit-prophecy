package io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_3

import io.prophecy.libs._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.UDFs._
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_3.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object SetOperation_1_1_2_2_1_1 {

  def apply(context: Context, in0: DataFrame, in1: DataFrame): DataFrame =
    List(in0, in1).flatMap(Option(_)).reduce(_.unionAll(_))

}
