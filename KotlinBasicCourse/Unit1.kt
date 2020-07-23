fun printBorder(border : String, timesToRepeat: Int) 
{
    repeat(timesToRepeat)
    {
        print(border)
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
        print(",")
    }    
    println() // Print an empty line   
 
    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}

fun main() {
	val age = 27
    val layers = 5
    val name = "Phoebe"
    
    val border = "`-._,-'"
    val repeatTime = 4
    // Let's print a cake!
    printCakeTop(age)
    printCakeCandles(age)
	printCakeBottom(age, layers)
    
    //println("   ,,,,,   ")
    //println("   |||||   ")
    //println(" =========")
    //println("@@@@@@@@@@@")
    //println("{~@~@~@~@~}")
    //println("@@@@@@@@@@@")
    
    // This prints an empty line.
    println("")
    
    printBorder(border, repeatTime)
    println("Happy Birthday, ${name}!")
    println("You are already ${age}!")
    println("${age} is the very best age to celebrate!")
    printBorder(border, repeatTime)
}