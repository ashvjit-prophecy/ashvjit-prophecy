package io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_2

import io.prophecy.libs._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperflargetotalnodes.udfs.UDFs._
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_2.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object SQLStatement_1_2_2_2_1_2_1 {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    in0.createOrReplaceTempView("in0")
    context.spark.sql("select * from in0")
  }

}
