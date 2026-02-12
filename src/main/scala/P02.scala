object P02 {
    def penultimate[A](nums: List[A]): A = nums match {
        case _ :: penultimate :: _ :: Nil => penultimate
        case _ :: tail => penultimate(tail)
        case _ => throw new java.util.NoSuchElementException()
    }
}