package problems

object P01 {

    // built in
    def last[A](nums: List[A]) -> A = nums.last

    def lastRecusive[A](nums: List[A]) -> = nums match {
        case h :: Nil => h
        case _ :: tail => lastRecusive(tail)
        case _ => throw new NoSuchElementException()
    }
}