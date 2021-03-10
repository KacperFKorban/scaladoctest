import scala.quoted._

object ParamAnnotations {
  inline def apply[T] = ${ paramAnnotationsImpl[T] }

  def paramAnnotationsImpl[T](using qctx: Quotes, tpe: Type[T]) = {
    import qctx.reflect._
    
    // TypeRepr.of[T].typeSymbol.caseFields.map(_.annotations).foreach(println)

    ???
  }
}