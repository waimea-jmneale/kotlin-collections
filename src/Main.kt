/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList!")
    println()

    //
    val snacks = mutableListOf<String>()

    //show it
    println(snacks)

    //add in some things
    snacks.add("BBQ Chips")
    snacks.add("Cookie")
    snacks.add("Moro Gold")
    snacks.add("Skittles")
    snacks.add("Berry Forest")
    snacks.add("Watermelon")
    snacks.add("Ice cream")

    println(snacks)

    //show specific items
    println(snacks[0])
    //println(snacks[6])  This would be out of bounds

    //change a value
    snacks[1] = "Dog Biscuits"
    println(snacks)

    //remove an item
    snacks.removeAt(0)
    println(snacks)

    //add in new items
    snacks.add(1, "Garlic bread")

    //sort the list
    snacks.sort()
    println(snacks)

    //shuffle the list (randomise)
    snacks.shuffle()
    println(snacks)

    //get a random item from the list
    val item = snacks.random()
    println(item)

    //loop through the list
    for (snack in snacks) {
        println(snack)
    }

}

