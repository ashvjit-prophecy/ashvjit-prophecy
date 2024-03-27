package io.prophecy.pipelines.livyscalapipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_2.config.{
  Config => Subgraph_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2.config.{
  Config => Subgraph_2_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_2.config.{
  Config => Subgraph_12_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_2.config.{
  Config => Subgraph_13_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_2.config.{
  Config => Subgraph_14_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_2.config.{
  Config => Subgraph_15_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2.config.{
  Config => Subgraph_2_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.sgScriptWith5ScriptEachHaving1000LOC.config.{
  Config => sgScriptWith5ScriptEachHaving1000LOC_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_5.config.{
  Config => Subgraph_5_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_6.config.{
  Config => Subgraph_6_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_10.config.{
  Config => Subgraph_10_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1.config.{
  Config => Subgraph_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1.config.{
  Config => Subgraph_12_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1.config.{
  Config => Subgraph_13_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1.config.{
  Config => Subgraph_14_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1.config.{
  Config => Subgraph_15_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1.config.{
  Config => Subgraph_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2.config.{
  Config => Subgraph_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12.config.{
  Config => Subgraph_12_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13.config.{
  Config => Subgraph_13_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14.config.{
  Config => Subgraph_14_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15.config.{
  Config => Subgraph_15_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_1_1_1.config.{
  Config => Subgraph_2_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_2_1_1_1.config.{
  Config => Subgraph_12_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_2_1_1_1.config.{
  Config => Subgraph_13_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_2_1_1_1.config.{
  Config => Subgraph_14_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_1_2.config.{
  Config => Subgraph_12_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_1_2.config.{
  Config => Subgraph_13_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_1_1.config.{
  Config => Subgraph_2_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_2_1_1.config.{
  Config => Subgraph_12_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_2_1_1.config.{
  Config => Subgraph_13_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_1.config.{
  Config => Subgraph_2_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_2_1.config.{
  Config => Subgraph_12_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_2_1.config.{
  Config => Subgraph_13_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_2_1.config.{
  Config => Subgraph_14_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_2_1.config.{
  Config => Subgraph_15_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_1.config.{
  Config => Subgraph_2_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_1_2_1.config.{
  Config => Subgraph_12_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_1_2_1.config.{
  Config => Subgraph_13_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_1_2_1.config.{
  Config => Subgraph_14_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1_2_1.config.{
  Config => Subgraph_15_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_7.config.{
  Config => Subgraph_7_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_8.config.{
  Config => Subgraph_8_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_2_1_1_1.config.{
  Config => Subgraph_15_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_1_1_1.config.{
  Config => Subgraph_2_1_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_1_2_1_1_1.config.{
  Config => Subgraph_12_1_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_1_2_1_1_1.config.{
  Config => Subgraph_13_1_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_1_2_1_1_1.config.{
  Config => Subgraph_14_1_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1_2_1_1_1.config.{
  Config => Subgraph_15_1_1_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_1.config.{
  Config => Subgraph_12_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_1.config.{
  Config => Subgraph_13_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_1.config.{
  Config => Subgraph_14_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1.config.{
  Config => Subgraph_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1.config.{
  Config => Subgraph_15_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_2_1_1.config.{
  Config => Subgraph_14_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_2_1_1.config.{
  Config => Subgraph_15_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_1_1.config.{
  Config => Subgraph_2_1_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_1_2_1_1.config.{
  Config => Subgraph_12_1_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_1_2_1_1.config.{
  Config => Subgraph_13_1_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_1_2_1_1.config.{
  Config => Subgraph_14_1_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1_2_1_1.config.{
  Config => Subgraph_15_1_1_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.config.{
  Config => Subgraph_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.sg100gems.config.{
  Config => sg100gems_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_12_1_1_1.config.{
  Config => Subgraph_12_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_13_1_1_1.config.{
  Config => Subgraph_13_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_3.config.{
  Config => Subgraph_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_4.config.{
  Config => Subgraph_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_11.config.{
  Config => Subgraph_11_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_1_2.config.{
  Config => Subgraph_14_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.sg5kLocScript5_1.config.{
  Config => sg5kLocScript5_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_14_1_1_1.config.{
  Config => Subgraph_14_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1_2.config.{
  Config => Subgraph_15_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_16.config.{
  Config => Subgraph_16_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_9.config.{
  Config => Subgraph_9_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_15_1_1_1.config.{
  Config => Subgraph_15_1_1_1_Config
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
  var Subgraph_1_2:                       Subgraph_1_2_Config = Subgraph_1_2_Config(),
  var c_string_default_value_dont_change: String = "default_value",
  var Subgraph_2:                         Subgraph_2_Config = Subgraph_2_Config(),
  var Subgraph_3:                         Subgraph_3_Config = Subgraph_3_Config(),
  var Subgraph_4:                         Subgraph_4_Config = Subgraph_4_Config(),
  var Subgraph_5:                         Subgraph_5_Config = Subgraph_5_Config(),
  var Subgraph_6:                         Subgraph_6_Config = Subgraph_6_Config(),
  var Subgraph_7:                         Subgraph_7_Config = Subgraph_7_Config(),
  var Subgraph_8:                         Subgraph_8_Config = Subgraph_8_Config(),
  var Subgraph_9:                         Subgraph_9_Config = Subgraph_9_Config(),
  var Subgraph_10:                        Subgraph_10_Config = Subgraph_10_Config(),
  var Subgraph_11:                        Subgraph_11_Config = Subgraph_11_Config(),
  var Subgraph_12:                        Subgraph_12_Config = Subgraph_12_Config(),
  var Subgraph_13:                        Subgraph_13_Config = Subgraph_13_Config(),
  var Subgraph_14:                        Subgraph_14_Config = Subgraph_14_Config(),
  var Subgraph_15:                        Subgraph_15_Config = Subgraph_15_Config(),
  var Subgraph_13_1:                      Subgraph_13_1_Config = Subgraph_13_1_Config(),
  var Subgraph_12_1:                      Subgraph_12_1_Config = Subgraph_12_1_Config(),
  var Subgraph_2_1:                       Subgraph_2_1_Config = Subgraph_2_1_Config(),
  var Subgraph_14_1:                      Subgraph_14_1_Config = Subgraph_14_1_Config(),
  var Subgraph_15_1:                      Subgraph_15_1_Config = Subgraph_15_1_Config(),
  var Subgraph_2_1_1:                     Subgraph_2_1_1_Config = Subgraph_2_1_1_Config(),
  var Subgraph_14_1_1:                    Subgraph_14_1_1_Config = Subgraph_14_1_1_Config(),
  var Subgraph_15_1_1:                    Subgraph_15_1_1_Config = Subgraph_15_1_1_Config(),
  var Subgraph_12_1_1:                    Subgraph_12_1_1_Config = Subgraph_12_1_1_Config(),
  var Subgraph_13_1_1:                    Subgraph_13_1_1_Config = Subgraph_13_1_1_Config(),
  var Subgraph_2_1_1_1:                   Subgraph_2_1_1_1_Config = Subgraph_2_1_1_1_Config(),
  var Subgraph_13_1_1_1:                  Subgraph_13_1_1_1_Config = Subgraph_13_1_1_1_Config(),
  var Subgraph_14_1_1_1:                  Subgraph_14_1_1_1_Config = Subgraph_14_1_1_1_Config(),
  var Subgraph_12_1_1_1:                  Subgraph_12_1_1_1_Config = Subgraph_12_1_1_1_Config(),
  var Subgraph_15_1_1_1:                  Subgraph_15_1_1_1_Config = Subgraph_15_1_1_1_Config(),
  var Subgraph_15_1_1_2_1: Subgraph_15_1_1_2_1_Config =
    Subgraph_15_1_1_2_1_Config(),
  var Subgraph_12_1_2_1: Subgraph_12_1_2_1_Config = Subgraph_12_1_2_1_Config(),
  var Subgraph_13_1_1_2_1: Subgraph_13_1_1_2_1_Config =
    Subgraph_13_1_1_2_1_Config(),
  var Subgraph_2_1_2_1: Subgraph_2_1_2_1_Config = Subgraph_2_1_2_1_Config(),
  var Subgraph_14_1_1_2_1: Subgraph_14_1_1_2_1_Config =
    Subgraph_14_1_1_2_1_Config(),
  var Subgraph_14_1_2_1: Subgraph_14_1_2_1_Config = Subgraph_14_1_2_1_Config(),
  var Subgraph_2_1_1_2_1: Subgraph_2_1_1_2_1_Config =
    Subgraph_2_1_1_2_1_Config(),
  var Subgraph_12_1_1_2_1: Subgraph_12_1_1_2_1_Config =
    Subgraph_12_1_1_2_1_Config(),
  var Subgraph_15_1_2_1: Subgraph_15_1_2_1_Config = Subgraph_15_1_2_1_Config(),
  var Subgraph_13_1_2_1: Subgraph_13_1_2_1_Config = Subgraph_13_1_2_1_Config(),
  var Subgraph_13_1_2_1_1: Subgraph_13_1_2_1_1_Config =
    Subgraph_13_1_2_1_1_Config(),
  var Subgraph_15_1_1_2_1_1: Subgraph_15_1_1_2_1_1_Config =
    Subgraph_15_1_1_2_1_1_Config(),
  var Subgraph_2_1_2_1_1: Subgraph_2_1_2_1_1_Config =
    Subgraph_2_1_2_1_1_Config(),
  var Subgraph_15_1_2_1_1: Subgraph_15_1_2_1_1_Config =
    Subgraph_15_1_2_1_1_Config(),
  var Subgraph_2_1_1_2_1_1: Subgraph_2_1_1_2_1_1_Config =
    Subgraph_2_1_1_2_1_1_Config(),
  var Subgraph_12_1_2_1_1: Subgraph_12_1_2_1_1_Config =
    Subgraph_12_1_2_1_1_Config(),
  var Subgraph_14_1_1_2_1_1: Subgraph_14_1_1_2_1_1_Config =
    Subgraph_14_1_1_2_1_1_Config(),
  var Subgraph_14_1_2_1_1: Subgraph_14_1_2_1_1_Config =
    Subgraph_14_1_2_1_1_Config(),
  var Subgraph_12_1_1_2_1_1: Subgraph_12_1_1_2_1_1_Config =
    Subgraph_12_1_1_2_1_1_Config(),
  var Subgraph_13_1_1_2_1_1: Subgraph_13_1_1_2_1_1_Config =
    Subgraph_13_1_1_2_1_1_Config(),
  var sg10kLOC10Subgraphs_1: Sg10kLOC10Subgraphs_1 = Sg10kLOC10Subgraphs_1(),
  var sg100gems:             sg100gems_Config = sg100gems_Config(),
  var sg10kLOC10Subgraphs:   Sg10kLOC10Subgraphs = Sg10kLOC10Subgraphs(),
  var Subgraph_14_1_2_1_1_1: Subgraph_14_1_2_1_1_1_Config =
    Subgraph_14_1_2_1_1_1_Config(),
  var Subgraph_15_1_1_2_1_1_1: Subgraph_15_1_1_2_1_1_1_Config =
    Subgraph_15_1_1_2_1_1_1_Config(),
  var Subgraph_15_1_2_1_1_1: Subgraph_15_1_2_1_1_1_Config =
    Subgraph_15_1_2_1_1_1_Config(),
  var Subgraph_12_1_2_1_1_1: Subgraph_12_1_2_1_1_1_Config =
    Subgraph_12_1_2_1_1_1_Config(),
  var Subgraph_12_1_1_2_1_1_1: Subgraph_12_1_1_2_1_1_1_Config =
    Subgraph_12_1_1_2_1_1_1_Config(),
  var Subgraph_2_1_1_2_1_1_1: Subgraph_2_1_1_2_1_1_1_Config =
    Subgraph_2_1_1_2_1_1_1_Config(),
  var Subgraph_13_1_1_2_1_1_1: Subgraph_13_1_1_2_1_1_1_Config =
    Subgraph_13_1_1_2_1_1_1_Config(),
  var Subgraph_2_1_2_1_1_1: Subgraph_2_1_2_1_1_1_Config =
    Subgraph_2_1_2_1_1_1_Config(),
  var Subgraph_14_1_1_2_1_1_1: Subgraph_14_1_1_2_1_1_1_Config =
    Subgraph_14_1_1_2_1_1_1_Config(),
  var Subgraph_13_1_2_1_1_1: Subgraph_13_1_2_1_1_1_Config =
    Subgraph_13_1_2_1_1_1_Config(),
  var sg5kLocScript5: Sg5kLocScript5 = Sg5kLocScript5(),
  var Subgraph_16:    Subgraph_16_Config = Subgraph_16_Config()
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
