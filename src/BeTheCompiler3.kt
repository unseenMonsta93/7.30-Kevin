class Cat2(var name: String? = null) {
    fun Meow() { println("Meow!")}
}
fun main(){
    var myCats = arrayOf(Cat2("Misty"),
        null,
        Cat2("Socks"))

    for (cat in myCats) {
        print("${cat?.name}:")
        cat?.Meow()
    }
}