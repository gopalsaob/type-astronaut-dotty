package chapter2

import shapeless3.deriving.K0

object UsingGeneric {

  trait Base

  case class A(a: Int, b: Double, c: String) extends Base
  case class B(b: Boolean, c: Short, d: Unit) extends Base


}
