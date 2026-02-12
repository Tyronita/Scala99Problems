import org.scalatest.funsuite.AnyFunSuite

class P02Spec extends AnyFunSuite {
    // P02 — penultimate element
    test("P02.penultimate returns second to last element") {
        assert(P02.penultimate(List(1, 2, 3, 4)) == 3)
        assert(P02.penultimate(List("a", "b", "c")) == "b")
    }

    test("P02.penultimate throws exception on short lists") {
        assertThrows[NoSuchElementException] {
            P02.penultimate(List(1))
        }
        assertThrows[NoSuchElementException] {
            P02.penultimate(Nil)
        }
    }

}