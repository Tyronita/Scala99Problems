import org.scalatest.funsuite.AnyFunSuite

class P03Spec extends AnyFunSuite {
  
  // P03 — nth element (0-based)
  test("P03.nth returns correct element") {
    assert(P03.kth_element(1, List(1, 2, 3)) == 1)
    assert(P03.kth_element(3, List(1, 2, 3)) == 3)
    assert(P03.kth_element(2, List("a", "b", "c")) == "b")
  }

  test("P03.nth throws exception for invalid index") {
    assertThrows[IndexOutOfBoundsException] {
      P03.kth_element(5, List(1, 2, 3))
    }
    assertThrows[IndexOutOfBoundsException] {
      P03.kth_element(-1, List(1, 2, 3))
    }
  }
}