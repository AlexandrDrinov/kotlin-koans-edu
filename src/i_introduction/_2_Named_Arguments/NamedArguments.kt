package i_introduction._2_Named_Arguments

// default values for arguments:
fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    // named arguments:
    bar(1, b = false)
}

fun todoTask2(collection: Collection<Int>): String = collection.joinToString(prefix="{", postfix="}")

fun task2(collection: Collection<Int>): String {
    return todoTask2(collection)
}
