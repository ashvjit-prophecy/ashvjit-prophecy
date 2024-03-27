package io.prophecy.pipelines.testperfmoresgraphs.graph

import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object src_emr_s3_source {

  def apply(context: Context): DataFrame =
    context.spark.read
      .format("csv")
      .option("header", true)
      .option("sep",    ",")
      .schema(
        StructType(
          Array(
            StructField("year",                 StringType, true),
            StructField("industry_code_ANZSIC", StringType, true),
            StructField("industry_name_ANZSIC", StringType, true),
            StructField("rme_size_grp",         StringType, true),
            StructField("variable",             StringType, true),
            StructField("value",                StringType, true),
            StructField("unit",                 StringType, true)
          )
        )
      )
      .load("s3://qa-prophecy/livydata/annual-enterprise/")

}
