package io.prophecy.pipelines.testperflargetotalnodes.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_1.config.{
  Config => sg100gems_1_Config
}
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_2.config.{
  Config => sg100gems_2_Config
}
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems.config.{
  Config => sg100gems_Config
}
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_3.config.{
  Config => sg100gems_3_Config
}
import io.prophecy.pipelines.testperflargetotalnodes.graph.sg100gems_4.config.{
  Config => sg100gems_4_Config
}

case class Config(
  var sg100gems:   sg100gems_Config = sg100gems_Config(),
  var sg100gems_1: sg100gems_1_Config = sg100gems_1_Config(),
  var sg100gems_2: sg100gems_2_Config = sg100gems_2_Config(),
  var sg100gems_3: sg100gems_3_Config = sg100gems_3_Config(),
  var sg100gems_4: sg100gems_4_Config = sg100gems_4_Config()
) extends ConfigBase
