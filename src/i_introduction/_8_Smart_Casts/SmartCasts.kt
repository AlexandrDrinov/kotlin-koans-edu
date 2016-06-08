package i_introduction._8_Smart_Casts

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun error():Int = throw IllegalArgumentException("Unknown expression")

fun eval(e: Expr): Int =
        when (e) {
            is Num -> todoTask8(e)
            is Sum -> todoTask8(e)
            else -> error()
        }

fun todoTask8(expr: Expr): Int {
    val result = when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> error()
    }
    return result
}



