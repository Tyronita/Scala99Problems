package problems

import org.scalatest.funsuite.AnyFunSuite

object P01Spec extends AnyFunSuite {
    test("last element of a normal list") {
        assert(P01.lastRecusive(List(1, 2, 3) == 3))
    }
    test("last element of a single list") {
        assert(P01.lastRecusive(List(42)) == 42)
    }
    test("empty list") {
        assert(P01.lastRecusive(List()) == Nil)
    }
}