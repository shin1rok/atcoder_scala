package ABC149.B

object Refactor1 extends App {
  val array: Array[Long] = readLine().split(' ').map(_.toLong)
  val A = array(0)
  val B = array(1)
  val K = array(2)

  val (a, b) = if (A + B <= K) {
    (0, 0)
  } else if (A >= K) {
    ((A - K), B)
  } else {
    (0, (A + B - K))
  }
  println(s"$a $b")
}
