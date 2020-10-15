import kotlin.math.PI
abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    abstract val area : Double
    fun hasRoom(): Boolean {
       return residents < capacity
    }
    
/// 判斷是否能有空間入住
//     fun getRoom() {
//         if (capacity > residents) {
//             residents++
//             println("You got a room!")
//         } else {
//             println("Sorry, at capacity and no rooms left.")
//         }
//     }
    abstract fun floorArea() : Double
}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override var area = 0.0
    override fun floorArea(): Double {
        area = length * length
        return area
    }
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override var area = 0.0
    override fun floorArea(): Double {
        area = PI * radius * radius
        return area
    }
}

class RoundTower(residents: Int, radius: Double, val floors: Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    
    override fun floorArea(): Double {
    	return PI * radius * radius * floors
	}
}
fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    val roundHut = RoundHut(6, 3.0)
    val roundTower = RoundTower(4, 15.5, 4)
       
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
	
	/// 判斷是否能有空間入住
        ///getRoom()
    }
    
    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        
	/// 判斷是否能有空間入住
        ///getRoom()
    }
    
    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        
	/// 判斷是否能有空間入住
        ///getRoom()
    }
}
