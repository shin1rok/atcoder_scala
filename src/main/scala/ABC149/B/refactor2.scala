package ABC149.B

object Refactor2 extends App {
  val Array(a, b, k) = readLine().split(' ').map(_.toLong)

  val (a2, b2) = if (a + b <= k) {
    (0, 0)
  } else if (a >= k) {
    ((a - k), b)
  } else {
    (0, (a + b - k))
  }
  println(s"$a2 $b2")
}
