package xd

sealed trait Color(r: Int, g: Int, b: Int)
object Red extends Color(255, 0, 0)
object Green extends Color(0, 255, 0)
object Blue extends Color(0, 0, 255)
