fun main(args: Array<String>) {
    val list = mutableListOf<Animal>()

    val herbivores = Herbivores( "Hippo", 220.5, "grass")
    val carnivores = Сarnivores ( "Wolf", 55.7, "forests")

    list.add(herbivores)
    list.add(carnivores)

    print(list)

}

open class Animal(var name: String, var weight: Double) {
    override fun toString(): String {
        return "name='$name', weight=$weight'"
    }
}

class Herbivores(name: String, weight: Double, var food: String) : Animal(name, weight) {
    override fun toString(): String {
        return "Herbivores(food='$food' ${super.toString()})"
    }
}

class Сarnivores(name: String, weight: Double, var habitat: String) : Animal(name, weight) {
    override fun toString(): String {
        return "Carnivores(habitat='$habitat' ${super.toString()})"
    }}

