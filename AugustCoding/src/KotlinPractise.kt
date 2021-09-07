

fun main (args: Array<String>) {
    var str = "Kush"
    str.let { println("$it!!") }
    println(str)

    var strLength = str.let { "$it function is the more to let".length }
    println("The length of the string is $strLength")

    var a = 1
    var b= 2

    a = a.let { it + 2 }.let {
        val i = it + b
        i   }
    println(a) //5

//    var name : String? = "Kotlin let null check"
//    name?.let { println(it) } //prints Kotlin let null check
//    name = null
//    name?.let { println(it) } //nothing happens


    var person = PersonDataClass("Kush", "Android")
    var xyz = with(person)
    {
        name = "No Name"
        tutorial = "Kotlin tutorials"
        val xyz = "End of tutorial"
        xyz
    }
    println(xyz)
}