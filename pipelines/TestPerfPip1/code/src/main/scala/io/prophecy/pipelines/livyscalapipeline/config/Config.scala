package io.prophecy.pipelines.livyscalapipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_1.config.{
  Config => Subgraph_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_5.config.{
  Config => Subgraph_2_5_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5.config.{
  Config => Subgraph_2_1_5_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_5.config.{
  Config => Subgraph_2_1_1_5_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_5.config.{
  Config => Subgraph_2_1_1_1_5_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_4.config.{
  Config => Subgraph_2_1_1_1_1_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2_3.config.{
  Config => Subgraph_2_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_3.config.{
  Config => Subgraph_2_1_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_3.config.{
  Config => Subgraph_2_1_1_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2_3.config.{
  Config => Subgraph_2_1_1_1_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1_2.config.{
  Config => Subgraph_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_4_1.config.{
  Config => Subgraph_2_4_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_4_1.config.{
  Config => Subgraph_2_1_4_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_1.config.{
  Config => Subgraph_2_1_5_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_3.config.{
  Config => Subgraph_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_3.config.{
  Config => Subgraph_2_1_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_3.config.{
  Config => Subgraph_2_1_1_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_3.config.{
  Config => Subgraph_2_1_1_1_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_2.config.{
  Config => Subgraph_2_1_1_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2_1.config.{
  Config => Subgraph_2_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_1.config.{
  Config => Subgraph_2_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_1.config.{
  Config => Subgraph_2_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_4.config.{
  Config => Subgraph_2_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_4_2.config.{
  Config => Subgraph_2_4_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_4_2.config.{
  Config => Subgraph_2_1_4_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_4_2.config.{
  Config => Subgraph_2_1_1_4_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_4_2.config.{
  Config => Subgraph_2_1_1_1_4_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_3_2.config.{
  Config => Subgraph_2_1_1_1_1_3_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2_2_2.config.{
  Config => Subgraph_2_2_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_4_3.config.{
  Config => Subgraph_2_4_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_4_3.config.{
  Config => Subgraph_2_1_4_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_4_1.config.{
  Config => Subgraph_2_1_1_4_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_4_1.config.{
  Config => Subgraph_2_1_1_1_4_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_2_2.config.{
  Config => Subgraph_2_1_2_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_2_2.config.{
  Config => Subgraph_2_1_1_2_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_4.config.{
  Config => Subgraph_2_1_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_4.config.{
  Config => Subgraph_2_1_1_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_4.config.{
  Config => Subgraph_2_1_1_1_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_3.config.{
  Config => Subgraph_2_1_1_1_1_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2_2.config.{
  Config => Subgraph_2_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_2.config.{
  Config => Subgraph_2_1_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2.config.{
  Config => Subgraph_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_3_1.config.{
  Config => Subgraph_2_1_1_1_1_3_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2_2_1.config.{
  Config => Subgraph_2_2_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_2_1.config.{
  Config => Subgraph_2_1_2_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_2_1.config.{
  Config => Subgraph_2_1_1_2_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2_2_1.config.{
  Config => Subgraph_2_1_1_1_2_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_9.config.{
  Config => Subgraph_2_1_5_9_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2_2_2.config.{
  Config => Subgraph_2_1_1_1_2_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_2.config.{
  Config => Subgraph_2_1_5_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_1.config.{
  Config => Subgraph_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_2.config.{
  Config => Subgraph_2_1_1_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_10.config.{
  Config => Subgraph_2_1_5_10_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1.config.{
  Config => Subgraph_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1.config.{
  Config => Subgraph_2_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1.config.{
  Config => Subgraph_2_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1.config.{
  Config => Subgraph_2_1_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2.config.{
  Config => Subgraph_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2.config.{
  Config => Subgraph_2_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2.config.{
  Config => Subgraph_2_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2.config.{
  Config => Subgraph_2_1_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1.config.{
  Config => Subgraph_2_1_1_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_4_3.config.{
  Config => Subgraph_2_1_1_4_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_4_3.config.{
  Config => Subgraph_2_1_1_1_4_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_3_3.config.{
  Config => Subgraph_2_1_1_1_1_3_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2_1.config.{
  Config => Subgraph_2_1_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.sg100gems.config.{
  Config => sg100gems_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2_2.config.{
  Config => Subgraph_2_1_1_1_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_4.config.{
  Config => Subgraph_2_1_5_4_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1_1.config.{
  Config => Subgraph_2_1_1_1_1_1_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_2_2_3.config.{
  Config => Subgraph_2_2_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_2_2_3.config.{
  Config => Subgraph_2_1_2_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_2_2_3.config.{
  Config => Subgraph_2_1_1_2_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_2_2_3.config.{
  Config => Subgraph_2_1_1_1_2_2_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_8.config.{
  Config => Subgraph_2_1_5_8_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1_2.config.{
  Config => Subgraph_2_1_1_1_1_1_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_7.config.{
  Config => Subgraph_2_1_5_7_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.T210Gem_10kLoc.config.{
  Config => T210Gem_10kLoc_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_6.config.{
  Config => Subgraph_2_1_5_6_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_3.config.{
  Config => Subgraph_2_1_5_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1_2_2.config.{
  Config => Subgraph_2_1_1_1_1_1_2_2_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1_2_1.config.{
  Config => Subgraph_2_1_1_1_1_1_2_1_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_5_5.config.{
  Config => Subgraph_2_1_5_5_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1_3.config.{
  Config => Subgraph_2_1_1_1_1_1_3_Config
}
import io.prophecy.pipelines.livyscalapipeline.graph.Subgraph_2_1_1_1_1_1_2_3.config.{
  Config => Subgraph_2_1_1_1_1_1_2_3_Config
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
  var Subgraph_2:                         Subgraph_2_Config = Subgraph_2_Config(),
  var Subgraph_2_1:                       Subgraph_2_1_Config = Subgraph_2_1_Config(),
  var Subgraph_2_1_1_1:                   Subgraph_2_1_1_1_Config = Subgraph_2_1_1_1_Config(),
  var Subgraph_2_1_1_1_1_1: Subgraph_2_1_1_1_1_1_Config =
    Subgraph_2_1_1_1_1_1_Config(),
  var Subgraph_2_2:     Subgraph_2_2_Config = Subgraph_2_2_Config(),
  var Subgraph_2_1_2:   Subgraph_2_1_2_Config = Subgraph_2_1_2_Config(),
  var Subgraph_2_1_1_2: Subgraph_2_1_1_2_Config = Subgraph_2_1_1_2_Config(),
  var Subgraph_2_1_1_1_2: Subgraph_2_1_1_1_2_Config =
    Subgraph_2_1_1_1_2_Config(),
  var Subgraph_2_1_1_2_1: Subgraph_2_1_1_2_1_Config =
    Subgraph_2_1_1_2_1_Config(),
  var Subgraph_2_1_1_1_3: Subgraph_2_1_1_1_3_Config =
    Subgraph_2_1_1_1_3_Config(),
  var Subgraph_2_1_1_1_1_2: Subgraph_2_1_1_1_1_2_Config =
    Subgraph_2_1_1_1_1_2_Config(),
  var Subgraph_2_1_1_3: Subgraph_2_1_1_3_Config = Subgraph_2_1_1_3_Config(),
  var Subgraph_2_1_2_1: Subgraph_2_1_2_1_Config = Subgraph_2_1_2_1_Config(),
  var Subgraph_2_1_1_1_2_1: Subgraph_2_1_1_1_2_1_Config =
    Subgraph_2_1_1_1_2_1_Config(),
  var Subgraph_2_1_1_1_1_1_1: Subgraph_2_1_1_1_1_1_1_Config =
    Subgraph_2_1_1_1_1_1_1_Config(),
  var Subgraph_2_3:   Subgraph_2_3_Config = Subgraph_2_3_Config(),
  var Subgraph_2_1_3: Subgraph_2_1_3_Config = Subgraph_2_1_3_Config(),
  var Subgraph_2_2_1: Subgraph_2_2_1_Config = Subgraph_2_2_1_Config(),
  var Subgraph_2_1_1_1_2_3: Subgraph_2_1_1_1_2_3_Config =
    Subgraph_2_1_1_1_2_3_Config(),
  var Subgraph_2_1_2_3: Subgraph_2_1_2_3_Config = Subgraph_2_1_2_3_Config(),
  var Subgraph_2_1_1_1_1_4: Subgraph_2_1_1_1_1_4_Config =
    Subgraph_2_1_1_1_1_4_Config(),
  var Subgraph_2_1_1_1_5: Subgraph_2_1_1_1_5_Config =
    Subgraph_2_1_1_1_5_Config(),
  var Subgraph_2_2_3:   Subgraph_2_2_3_Config = Subgraph_2_2_3_Config(),
  var Subgraph_2_1_1_5: Subgraph_2_1_1_5_Config = Subgraph_2_1_1_5_Config(),
  var Subgraph_2_5:     Subgraph_2_5_Config = Subgraph_2_5_Config(),
  var Subgraph_2_1_1_2_3: Subgraph_2_1_1_2_3_Config =
    Subgraph_2_1_1_2_3_Config(),
  var Subgraph_2_1_1_1_1_1_3: Subgraph_2_1_1_1_1_1_3_Config =
    Subgraph_2_1_1_1_1_1_3_Config(),
  var Subgraph_2_1_5:   Subgraph_2_1_5_Config = Subgraph_2_1_5_Config(),
  var Subgraph_2_1_4_3: Subgraph_2_1_4_3_Config = Subgraph_2_1_4_3_Config(),
  var Subgraph_2_4_3:   Subgraph_2_4_3_Config = Subgraph_2_4_3_Config(),
  var Subgraph_2_1_1_1_4_3: Subgraph_2_1_1_1_4_3_Config =
    Subgraph_2_1_1_1_4_3_Config(),
  var Subgraph_2_1_1_1_1_3_3: Subgraph_2_1_1_1_1_3_3_Config =
    Subgraph_2_1_1_1_1_3_3_Config(),
  var Subgraph_2_1_1_1_2_2_3: Subgraph_2_1_1_1_2_2_3_Config =
    Subgraph_2_1_1_1_2_2_3_Config(),
  var Subgraph_2_1_2_2_3: Subgraph_2_1_2_2_3_Config =
    Subgraph_2_1_2_2_3_Config(),
  var Subgraph_2_1_1_2_2_3: Subgraph_2_1_1_2_2_3_Config =
    Subgraph_2_1_1_2_2_3_Config(),
  var Subgraph_2_2_2_3: Subgraph_2_2_2_3_Config = Subgraph_2_2_2_3_Config(),
  var Subgraph_2_1_1_4_3: Subgraph_2_1_1_4_3_Config =
    Subgraph_2_1_1_4_3_Config(),
  var Subgraph_2_1_1_1_1_1_2_3: Subgraph_2_1_1_1_1_1_2_3_Config =
    Subgraph_2_1_1_1_1_1_2_3_Config(),
  var Subgraph_2_1_5_10: Subgraph_2_1_5_10_Config = Subgraph_2_1_5_10_Config(),
  var Subgraph_2_4:      Subgraph_2_4_Config = Subgraph_2_4_Config(),
  var Subgraph_2_1_1_2_2_2: Subgraph_2_1_1_2_2_2_Config =
    Subgraph_2_1_1_2_2_2_Config(),
  var Subgraph_2_1_1_1_1_3_2: Subgraph_2_1_1_1_1_3_2_Config =
    Subgraph_2_1_1_1_1_3_2_Config(),
  var Subgraph_2_1_2_2_2: Subgraph_2_1_2_2_2_Config =
    Subgraph_2_1_2_2_2_Config(),
  var Subgraph_2_1_1_1_2_2_2: Subgraph_2_1_1_1_2_2_2_Config =
    Subgraph_2_1_1_1_2_2_2_Config(),
  var Subgraph_2_1_5_4: Subgraph_2_1_5_4_Config = Subgraph_2_1_5_4_Config(),
  var Subgraph_2_1_1:   Subgraph_2_1_1_Config = Subgraph_2_1_1_Config(),
  var Subgraph_2_4_2:   Subgraph_2_4_2_Config = Subgraph_2_4_2_Config(),
  var Subgraph_2_1_5_8: Subgraph_2_1_5_8_Config = Subgraph_2_1_5_8_Config(),
  var Subgraph_2_1_1_2_2_1: Subgraph_2_1_1_2_2_1_Config =
    Subgraph_2_1_1_2_2_1_Config(),
  var Subgraph_2_1_1_4_2: Subgraph_2_1_1_4_2_Config =
    Subgraph_2_1_1_4_2_Config(),
  var Subgraph_2_1_1_1_4_2: Subgraph_2_1_1_1_4_2_Config =
    Subgraph_2_1_1_1_4_2_Config(),
  var Subgraph_2_1_2_2: Subgraph_2_1_2_2_Config = Subgraph_2_1_2_2_Config(),
  var Subgraph_2_1_1_1_1_3_1: Subgraph_2_1_1_1_1_3_1_Config =
    Subgraph_2_1_1_1_1_3_1_Config(),
  var Subgraph_2_1_5_7: Subgraph_2_1_5_7_Config = Subgraph_2_1_5_7_Config(),
  var Subgraph_2_1_1_1_1_1_2_2: Subgraph_2_1_1_1_1_1_2_2_Config =
    Subgraph_2_1_1_1_1_1_2_2_Config(),
  var Subgraph_2_1_1_1_4_1: Subgraph_2_1_1_1_4_1_Config =
    Subgraph_2_1_1_1_4_1_Config(),
  var Subgraph_2_1_1_1_2_2: Subgraph_2_1_1_1_2_2_Config =
    Subgraph_2_1_1_1_2_2_Config(),
  var Subgraph_2_1_4_1: Subgraph_2_1_4_1_Config = Subgraph_2_1_4_1_Config(),
  var Subgraph_2_2_2_2: Subgraph_2_2_2_2_Config = Subgraph_2_2_2_2_Config(),
  var Subgraph_2_1_1_2_2: Subgraph_2_1_1_2_2_Config =
    Subgraph_2_1_1_2_2_Config(),
  var Subgraph_2_1_1_1_1: Subgraph_2_1_1_1_1_Config =
    Subgraph_2_1_1_1_1_Config(),
  var Subgraph_2_1_1_1_1_1_2: Subgraph_2_1_1_1_1_1_2_Config =
    Subgraph_2_1_1_1_1_1_2_Config(),
  var Subgraph_2_1_1_1_1_3: Subgraph_2_1_1_1_1_3_Config =
    Subgraph_2_1_1_1_1_3_Config(),
  var Subgraph_2_2_2: Subgraph_2_2_2_Config = Subgraph_2_2_2_Config(),
  var Subgraph_2_1_1_1_4: Subgraph_2_1_1_1_4_Config =
    Subgraph_2_1_1_1_4_Config(),
  var Subgraph_2_1_1_4_1: Subgraph_2_1_1_4_1_Config =
    Subgraph_2_1_1_4_1_Config(),
  var Subgraph_2_4_1: Subgraph_2_4_1_Config = Subgraph_2_4_1_Config(),
  var Subgraph_2_1_1_1_1_1_2_1: Subgraph_2_1_1_1_1_1_2_1_Config =
    Subgraph_2_1_1_1_1_1_2_1_Config(),
  var Subgraph_2_2_2_1: Subgraph_2_2_2_1_Config = Subgraph_2_2_2_1_Config(),
  var Subgraph_2_1_5_3: Subgraph_2_1_5_3_Config = Subgraph_2_1_5_3_Config(),
  var Subgraph_2_1_5_2: Subgraph_2_1_5_2_Config = Subgraph_2_1_5_2_Config(),
  var Subgraph_2_1_5_6: Subgraph_2_1_5_6_Config = Subgraph_2_1_5_6_Config(),
  var Subgraph_2_1_1_1_2_2_1: Subgraph_2_1_1_1_2_2_1_Config =
    Subgraph_2_1_1_1_2_2_1_Config(),
  var Subgraph_2_1_5_5: Subgraph_2_1_5_5_Config = Subgraph_2_1_5_5_Config(),
  var Subgraph_2_1_1_4: Subgraph_2_1_1_4_Config = Subgraph_2_1_1_4_Config(),
  var Subgraph_2_1_5_1: Subgraph_2_1_5_1_Config = Subgraph_2_1_5_1_Config(),
  var Subgraph_2_1_2_2_1: Subgraph_2_1_2_2_1_Config =
    Subgraph_2_1_2_2_1_Config(),
  var Subgraph_2_1_5_9: Subgraph_2_1_5_9_Config = Subgraph_2_1_5_9_Config(),
  var Subgraph_2_1_4_2: Subgraph_2_1_4_2_Config = Subgraph_2_1_4_2_Config(),
  var Subgraph_2_1_4:   Subgraph_2_1_4_Config = Subgraph_2_1_4_Config(),
  var sg100gems:        sg100gems_Config = sg100gems_Config(),
  var T210Gem_10kLoc:   T210Gem_10kLoc_Config = T210Gem_10kLoc_Config()
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
