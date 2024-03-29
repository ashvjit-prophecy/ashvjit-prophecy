package io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.config

import io.prophecy.libs._
import pureconfig._
import pureconfig.generic.ProductHint
import org.apache.spark.sql.SparkSession

object Config {

  implicit val confHint: ProductHint[Config] =
    ProductHint[Config](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Config(
  var c_sg_string: String = "sdasdasdsad",
  var c_sg_array:  List[String] = List("22", "323", "0", "-2123"),
  var c_sg_record: C_sg_record = C_sg_record(),
  var c_string:    String = "old_value_string_to_check",
  var c_int:       Int = 22,
  var c_long:      Long = 222L,
  var c_boolean:   Boolean = true,
  var c_double:    Double = 423423.0d,
  var c_float:     Float = 1021321.1f,
  var c_short:     Short = 22,
  var c_array: List[C_array] = List(
    C_array(car_string = "asdasd",               car_int = 44),
    C_array(car_string = "2312sdfsdfsdf$$^&*()", car_int = 55)
  ),
  var c_record: C_record = C_record()
) extends ConfigBase

object C_sg_record {

  implicit val confHint: ProductHint[C_sg_record] =
    ProductHint[C_sg_record](ConfigFieldMapping(CamelCase, CamelCase))

}

case class C_sg_record(
  var csgr_boolean: Boolean = true,
  var csgr_int:     Int = 2312
)

object C_array {

  implicit val confHint: ProductHint[C_array] =
    ProductHint[C_array](ConfigFieldMapping(CamelCase, CamelCase))

}

case class C_array(var car_string: String, var car_int: Int)

object C_record {

  implicit val confHint: ProductHint[C_record] =
    ProductHint[C_record](ConfigFieldMapping(CamelCase, CamelCase))

}

case class C_record(
  var cr_boolean:      Boolean = true,
  var cr_array_string: List[String] = List("asdasd", "sdasdasdasd"),
  var cr_array_double: List[Double] = List(34534.0d, -24.0d, 0.0d)
)

case class Context(spark: SparkSession, config: Config)
