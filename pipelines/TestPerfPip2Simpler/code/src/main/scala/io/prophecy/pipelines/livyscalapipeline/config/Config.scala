package io.prophecy.pipelines.livyscalapipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_1.config.{
  Config => Subgraph_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_2.config.{
  Config => Subgraph_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.config.{
  Config => Subgraph_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2.config.{
  Config => Subgraph_2_Config
}

case class Config(
  var c_string:  String = "old_value_string_to_check",
  var c_int:     Int = 22,
  var c_long:    Long = 222L,
  var c_boolean: Boolean = true,
  var c_double:  Double = 423423.0d,
  var c_float:   Float = 1021321.1f,
  var c_short:   Short = 22,
  var c_array: List[C_array] = List(
    C_array(car_string = "asdasd",               car_int = 44),
    C_array(car_string = "2312sdfsdfsdf$$^&*()", car_int = 55)
  ),
  var c_record:                           C_record = C_record(),
  var Subgraph_1:                         Subgraph_1_Config = Subgraph_1_Config(),
  var Subgraph_1_1:                       Subgraph_1_1_Config = Subgraph_1_1_Config(),
  var Subgraph_1_2:                       Subgraph_1_2_Config = Subgraph_1_2_Config(),
  var c_string_default_value_dont_change: String = "default_value",
  var Subgraph_2:                         Subgraph_2_Config = Subgraph_2_Config()
) extends ConfigBase

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
