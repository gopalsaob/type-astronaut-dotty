package chapter2

import chapter2.UsingGeneric.A
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import shapeless3.deriving.K0

class UsingGenericSpec extends AnyFreeSpec with Matchers {

  "Generic.to should work" in {
    val genA = K0.ProductGeneric[A]
    val repr = genA.toRepr(A(5, 3.0, "Foo"))
    println(repr)
    val result = genA.fromRepr(repr)
    println(result)
  }

}
