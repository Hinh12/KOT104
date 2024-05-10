package com.example.lab1_ph42207

//class VD_KL {
//}
//VD1
//fun main() {
//
//    infix fun Int.times(str: String) = str.repeat(this)        // 1
//    println(2 times "Bye ")                                    // 2
//
//    val pair = "Ferrari" to "Katrina"                          // 3
//    println(pair)
//
//    infix fun String.onto(other: String) = Pair(this, other)   // 4
//    val myPair = "McLaren" onto "Lucas"
//    println(myPair)
//
//    val sophia = Person("Sophia")
//    val claudia = Person("Claudia")
//    sophia likes claudia                                       // 5
//}
//
//class Person(val name: String) {
//    val likedPeople = mutableListOf<Person>()
//    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
//}

//VD2
//open class Dog {                // 1
//    open fun sayHello() {       // 2
//        println("wow wow!")
//    }
//}
//
//class Yorkshire : Dog() {       // 3
//    override fun sayHello() {   // 4
//        println("wif wif!")
//    }
//}
//
//fun main() {
//    val dog: Dog = Yorkshire()
//    dog.sayHello()
//}

//VD3
//open class Tiger(val origin: String) {
//    fun sayHello() {
//        println("A tiger from $origin says: grrhhh!")
//    }
//}
//
//class SiberianTiger : Tiger("Siberia")                  // 1
//
//fun main() {
//    val tiger: Tiger = SiberianTiger()
//    tiger.sayHello()
//}

//VD4
//fun printMessage(message: String): Unit {                               // 1
//    println(message)
//}
//
//fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
//    println("[$prefix] $message")
//}
//
//fun sum(x: Int, y: Int): Int {                                          // 3
//    return x + y
//}
//
//fun multiply(x: Int, y: Int) = x * y                                    // 4
//
//fun main() {
//    printMessage("Hello")                                               // 5
//    printMessageWithPrefix("Hello", "Log")                              // 6
//    printMessageWithPrefix("Hello")                                     // 7
//    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
//    println(sum(1, 2))                                                  // 9
//    println(multiply(2, 4))                                             // 10
//}

//VD5
//fun main(){
//    operator fun Int.times(str: String) = str.repeat(this)       // 1
//    println(2 * "Bye ")                                          // 2
//
//    operator fun String.get(range: IntRange) = substring(range)  // 3
//    val str = "Always forgive your enemies; nothing annoys them so much."
//    println(str[0..14])                                          // 4
//}

//VD6
//fun main(){
//    fun printAll(vararg messages: String) {                            // 1
//        for (m in messages) println(m)
//    }
//    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2
//
//    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
//        for (m in messages) println(prefix + m)
//    }
//    printAllWithPrefix(
//        "Hello", "Hallo", "Salut", "Hola", "你好",
//        prefix = "Greeting: "                                          // 4
//    )
//
//    fun log(vararg entries: String) {
//        printAll(*entries)                                             // 5
//    }
//    log("Hello", "Hallo", "Salut", "Hola", "你好")
//}

//VD7
//fun main(){
//    var a: String = "initial"  // 1
//    println(a)
//    val b: Int = 1             // 2
//    val c = 3                  // 3
//}

//VD8
//fun main() {
//    cases("Hello")
//    cases(1)
//    cases(0L)
//    cases(MyClass())
//    cases("hello")
//}
//
//fun cases(obj: Any) {
//    when (obj) {                                     // 1
//        1 -> println("One")                          // 2
//        "Hello" -> println("Greeting")               // 3
//        is Long -> println("Long")                   // 4
//        !is String -> println("Not a string")        // 5
//        else -> println("Unknown")                   // 6
//    }
//}
//
//class MyClass

//VD9
//fun main() {
//    println(whenAssign("Hello"))
//    println(whenAssign(3.4))
//    println(whenAssign(1))
//    println(whenAssign(MyClass()))
//}
//
//fun whenAssign(obj: Any): Any {
//    val result = when (obj) {                   // 1
//        1 -> "one"                              // 2
//        "Hello" -> 1                            // 3
//        is Long -> false                        // 4
//        else -> 42                              // 5
//    }
//    return result
//}
//
//class MyClass

//VD10
//fun main(){
//    for(i in 0..3) {             // 1
//        print(i)
//    }
//    print(" ")
//
//    for(i in 0 until 3) {        // 2
//        print(i)
//    }
//    print(" ")
//
//    for(i in 2..8 step 2) {      // 3
//        print(i)
//    }
//    print(" ")
//
//    for (i in 3 downTo 0) {      // 4
//        print(i)
//    }
//    print(" ")
//}

//VD10
//fun main(){
//    for (c in 'a'..'d') {        // 1
//        print(c)
//    }
//    print(" ")
//
//    for (c in 'z' downTo 's' step 2) { // 2
//        print(c)
//    }
//    print(" ")
//}