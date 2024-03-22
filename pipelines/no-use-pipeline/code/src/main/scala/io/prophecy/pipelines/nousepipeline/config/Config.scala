package io.prophecy.pipelines.nousepipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._

case class Config(var xcxzc: List[Xcxzc] = List(Xcxzc(xcx = "xcxe")))
    extends ConfigBase

object Xcxzc {

  implicit val confHint: ProductHint[Xcxzc] =
    ProductHint[Xcxzc](ConfigFieldMapping(CamelCase, CamelCase))

}

case class Xcxzc(var xcx: String)
