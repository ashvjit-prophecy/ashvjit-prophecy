package io.prophecy.pipelines.testperf4.graph

import io.prophecy.libs._
import io.prophecy.pipelines.testperf4.udfs.PipelineInitCode._
import io.prophecy.pipelines.testperf4.graph.sgScriptWith5ScriptEachHaving1000LOC.config._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._
package object sgScriptWith5ScriptEachHaving1000LOC {

  def apply(context: Context, in0: DataFrame): DataFrame = {
    val df_scala_code_snippets = scala_code_snippets(context, in0)
    val df_scala_code_snippets_1 =
      scala_code_snippets_1(context, df_scala_code_snippets)
    val df_scala_code_snippets_1_1 =
      scala_code_snippets_1_1(context, df_scala_code_snippets_1)
    val df_scala_code_snippets_1_1_1 =
      scala_code_snippets_1_1_1(context, df_scala_code_snippets_1_1)
    val df_scala_code_snippets_1_1_1_1 =
      scala_code_snippets_1_1_1_1(context, df_scala_code_snippets_1_1_1)
    df_scala_code_snippets_1_1_1_1
  }

}
