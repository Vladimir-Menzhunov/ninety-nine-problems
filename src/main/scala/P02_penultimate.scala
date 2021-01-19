import scala.annotation.tailrec

object P02_penultimate extends App {
  /*
  scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5
  */

  @tailrec
  def penultimate[A](list: List[A]): A = list match {
    case a :: _ :: Nil => a
    case _ :: tail     => penultimate(tail)
    case _             => throw new NoSuchElementException()
  }

  print(penultimate(List(1, 1, 2, 3, 5, 8)))

}
