class Cat3(var name: String? = null) {
    fun Meow() { println("Meow!")}
}
fun main(){
    var myCats = arrayOf(Cat3("Misty"),
        Cat3( null),
        Cat3("Socks"))

    for (cat in myCats) {
        if (cat != null) {
            print("${cat?.name}:")
            cat?.Meow()
        }
    }
}