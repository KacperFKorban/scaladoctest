import scala.quoted._
import scala.compiletime.erasedValue

object DefaultValues {
  inline def apply[T]: List[(String, Option[Any])] = ${ defaultValuesImpl[T] }

  def defaultValuesImpl[T](using qctx: Quotes, tpe: Type[T]): Expr[List[(String, Option[Any])]] = {
    import qctx.reflect._
    val tpe = TypeRepr.of[T]
    val symbol = tpe.typeSymbol
    val constr = symbol.primaryConstructor.tree.asInstanceOf[DefDef]
    tpe.typeSymbol.caseFields.map(_.tree.asInstanceOf[ValDef].rhs).foreach(println)
    ???
  }
}
