package ABC149.B

object Main extends App {
  val array: Array[Long] = readLine().split(' ').map(_.toLong)
  val A = array(0)
  val B = array(1)
  val K = array(2)

  if (A + B <= K) {
    println("0 0")
  } else if (A >= K) {
    println((A - K).toString + " " + B.toString)
  } else {
    println("0 " + (A + B - K).toString)
  }
}
