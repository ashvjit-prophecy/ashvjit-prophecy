package io.prophecy.pipelines.testperfmoresgraphs.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG.config.{
  Config => sg10InsideSG_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_1.config.{
  Config => sg10InsideSG_1_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_2.config.{
  Config => sg10InsideSG_2_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_3.config.{
  Config => sg10InsideSG_3_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_4.config.{
  Config => sg10InsideSG_4_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_6.config.{
  Config => sg10InsideSG_6_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_7.config.{
  Config => sg10InsideSG_7_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_8.config.{
  Config => sg10InsideSG_8_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_9.config.{
  Config => sg10InsideSG_9_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_10.config.{
  Config => sg10InsideSG_10_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_11.config.{
  Config => sg10InsideSG_11_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_13.config.{
  Config => sg10InsideSG_13_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_5.config.{
  Config => sg10InsideSG_5_Config
}
import io.prophecy.pipelines.testperfmoresgraphs.graph.sg10InsideSG_12.config.{
  Config => sg10InsideSG_12_Config
}

case class Config(
  var sg10InsideSG:    sg10InsideSG_Config = sg10InsideSG_Config(),
  var sg10InsideSG_1:  sg10InsideSG_1_Config = sg10InsideSG_1_Config(),
  var sg10InsideSG_2:  sg10InsideSG_2_Config = sg10InsideSG_2_Config(),
  var sg10InsideSG_3:  sg10InsideSG_3_Config = sg10InsideSG_3_Config(),
  var sg10InsideSG_4:  sg10InsideSG_4_Config = sg10InsideSG_4_Config(),
  var sg10InsideSG_5:  sg10InsideSG_5_Config = sg10InsideSG_5_Config(),
  var sg10InsideSG_6:  sg10InsideSG_6_Config = sg10InsideSG_6_Config(),
  var sg10InsideSG_7:  sg10InsideSG_7_Config = sg10InsideSG_7_Config(),
  var sg10InsideSG_8:  sg10InsideSG_8_Config = sg10InsideSG_8_Config(),
  var sg10InsideSG_9:  sg10InsideSG_9_Config = sg10InsideSG_9_Config(),
  var sg10InsideSG_10: sg10InsideSG_10_Config = sg10InsideSG_10_Config(),
  var sg10InsideSG_11: sg10InsideSG_11_Config = sg10InsideSG_11_Config(),
  var sg10InsideSG_12: sg10InsideSG_12_Config = sg10InsideSG_12_Config(),
  var sg10InsideSG_13: sg10InsideSG_13_Config = sg10InsideSG_13_Config()
) extends ConfigBase
