data class Movie(val title: String, val years: String)

class Song(val title: String, val artist: String)

fun main(args: Array<String>) {
    var m1 = Movie("Black Panther", "2018")
    val m2 = Movie("Jurassic World", "2015")
    val m3 = Movie("Jurassic World", "2015")
    var s1 = Song("Love Cats", "The Cure")
    var s2 = Song("Wild Horses", "The Rolling Stones")
    var s3 = Song("Love Cats", "The Cure")
}