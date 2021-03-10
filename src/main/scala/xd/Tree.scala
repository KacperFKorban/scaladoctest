package xd

enum Tree[+T]:
  case Branch(left: Tree[T], elem: T, right: Tree[T]) extends Tree[T]
  case Leaf(elem: T) extends Tree[T]
  case TreeEnd extends Tree[Nothing]