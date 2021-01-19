import scala.annotation.tailrec

object P01_lastElList extends App {

  /*
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
  */

  def last[A](list: List[A]): A = {
    list.last
  }

  @tailrec
  def lastRecursive[A](list: List[A]): A = list match {
    case el :: Nil => el
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException()
  }

}
