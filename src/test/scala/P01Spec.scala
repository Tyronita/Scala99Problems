import org.scalatest.funsuite.AnyFunSuite

class P01Spec extends AnyFunSuite {

  // P01 — last element
  test("P01.last returns last element of list") {
    assert(P01.lastRecusive(List(1, 2, 3, 4)) == 4)
    assert(P01.lastRecusive(List("a", "b", "c")) == "c")
  }

  test("P01.last throws exception on empty list") {
    assertThrows[NoSuchElementException] {
      P01.lastRecusive(Nil)
    }
  }
}
