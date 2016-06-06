package i_introduction._4_Lambdas

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>, predicate: (Int) -> Boolean): Boolean {
    //val predicate: (Int) -> Boolean = { x -> x % 42 ==0 }
    for (it in collection) {
        if (predicate(it)) {
            return true
        }
    }
    return false
}

fun task4(collection: Collection<Int>): Boolean = todoTask4(collection, { it % 42 ==0 })





