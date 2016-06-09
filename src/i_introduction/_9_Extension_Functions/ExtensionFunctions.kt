package i_introduction._9_Extension_Functions

fun String.lastChar() = this.get(this.length - 1)

// 'this' can be omitted
fun String.lastChar1() = get(length - 1)

fun use() {
    // try Ctrl+Space "default completion" after the dot: lastChar() is visible
    "abc".lastChar()
}

// 'lastChar' is compiled to a static function in the class ExtensionFunctionsKt (see JavaCode9.useExtension)

fun todoTask9(param1:Int, param2: Int): RationalNumber = RationalNumber(param1, param2)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = todoTask9(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = todoTask9(first, second)
