object P03 {
    def kth_element[A](k: Int, ls: List[A]): A = (k, ls) match {
        case (n, _) if n <= 0 => throw new IndexOutOfBoundsException(s"Index $k is negative")
        case (1, head :: _) => head
        case (n, _ :: tail) => kth_element(k - 1, tail)
        case (_, Nil) => throw new IndexOutOfBoundsException(s"Index $k out of bounds")
    }
}