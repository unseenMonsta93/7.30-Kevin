class Cat1(var name: String? = null) {
    fun Meow() { println("Meow!")}
}
fun main(){
    var myCats = arrayOf(Cat1("Misty"),
                                    Cat1(null),
                                    Cat1("Socks"))

    for (cat in myCats) {
            print("${cat.name}:")
            cat.Meow()
    }
}