package io.prophecy.pipelines.livysmallanother.graph

import io.prophecy.libs._
import io.prophecy.pipelines.livysmallanother.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object qa_table {

  def apply(context: Context): DataFrame =
    context.spark.read.table("`qa_database`.`qa_table`")

}
