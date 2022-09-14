import kotlin.random.Random

var array = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
var amount = arrayOf("${Random.nextInt(1,100)}", "${Random.nextInt(1,100)}","${Random.nextInt(1,100)}","${Random.nextInt(1,100)}")

fun main() {
    var userResponse: Int
    do {
        println("1) Item 1: ${amount[0]}")
        println("2) Item 2: ${amount[1]}")
        println("3) Item 3: ${amount[2]}")
        println("4) Item 4: ${amount[3]}")
        println("5) Exit")
        println("Choose an item to modify: ")
        userResponse = readln().toInt()
    }while (userResponse<1 || userResponse>5)
    when (userResponse) {
        1 -> display(0)
        2 -> display(1)
        3 -> display(2)
        4 -> display(3)
        else -> println("Exiting program.")
    }


}

fun display(position: Int) {
    println("${array[position]} has a value of: ${amount[position]}")
   var userResponse: Int
    do {
        println("1) Add")
        println("2) Subtract")
        println("3) Go Back")
        println("Choose what to do with the value: ")
      userResponse = readln().toInt()
    }while (userResponse<1 || userResponse>3)
    when (userResponse) {
        1 -> {
            println("Enter a value to add: ")
            val add = readln().toInt()
            println("Adding $add to the original amount of ${amount[position]} = " + ((amount[position]).toInt() + add).toString())
            amount[position] = ((amount[position]).toInt() + add).toString()
            display(position)
        }
        2 -> {
            println("Enter a value to subtract: ")
            val subtract = readln().toInt()
            amount[position] = ((amount[position]).toInt() - subtract).toString()
            if (amount[position]< 0.toString()) {
                println("Value cannot go lower than 0.")
                amount[position] = 0.toString()
            }
            else
                println("Subtracting $subtract from the original amount of ${amount[position]} = " + ((amount[position]).toInt() - subtract).toString())

            display(position)
        }
        3 -> main()


    }


}
