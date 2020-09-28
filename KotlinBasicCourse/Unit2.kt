class Dice {
    var sides = 6
    var randomNumber = 0
    
    fun roll1() : Int 
    {
	var randomNumber = (1..sides).random()
        return randomNumber
    }
    
    fun roll2() 
    {
	randomNumber = (1..sides).random()
    }
}

fun main() {
    println("Hello, world!")
    var dice1 = Dice()
    dice1.sides = 6
    dice1.roll2()
    
    var dice2 = Dice()
    dice2.sides = 6
    dice2.roll2()
    
    var dice3 = Dice()
    dice3.sides = 6
    dice3.roll2()
    
    println("First dice  : " + dice1.randomNumber)
    println("Second dice : " + dice2.randomNumber)
    println("Third dice  : " + dice3.randomNumber)
    
    var score = dice1.randomNumber + dice2.randomNumber + dice3.randomNumber
	println("Score : " + score)
}
