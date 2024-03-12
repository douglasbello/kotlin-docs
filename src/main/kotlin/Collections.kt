// LISTS - ordered collections of items
// SETS - unique unordered collections of items
// MAPS - sets of key-value pairs where keys are unique and map to only one value

fun list() {
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    // [triangle, square, circle]

    // Mutable list with explicit type declaration
//    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
//    println(shapes)
    // [triangle, square, circle]

    // to prevent unwanted modifications, you can obtain read-only views of mutable lists by assigning them to a List:
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes
    // this is also called casting

    println("The first item in the list is: ${readOnlyShapes.first()}")
}

fun set() {
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)

    // [apple, banana, cherry]
}

fun map() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}
}