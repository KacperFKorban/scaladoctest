
object Main extends App {
  /**
    * Binary tree structure, kinda
    */
  enum Tree[+T]:
    case Branch(left: Tree[T], elem: T, right: Tree[T]) extends Tree[T]
    case Leaf(elem: T) extends Tree[T]
    case TreeEnd extends Tree[Nothing]
}

@main def hello: Unit = {
  case class Attributed(
    p: Int = 1
  )
}