package io.prophecy.pipelines.nousepipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.nousepipeline.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object scala_customers {

  def apply(context: Context): DataFrame =
    context.spark.read
      .format("csv")
      .option("header", true)
      .option("sep",    ",")
      .schema(
        StructType(
          Array(
            StructField("customer_id",       StringType, true),
            StructField("first_name",        StringType, true),
            StructField("last_name",         StringType, true),
            StructField("phone",             StringType, true),
            StructField("email",             StringType, true),
            StructField("country_code",      StringType, true),
            StructField("account_open_date", StringType, true),
            StructField("account_flags",     StringType, true)
          )
        )
      )
      .load(
        "dbfs:/Prophecy/48a52ed80162c6d975fc0799ccfa44bf/CustomersDatasetInput.csv"
      )

}
