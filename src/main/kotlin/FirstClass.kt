
//val name: String = "Michael"
//var surname: String? ="Tyasi"
//var greeting : String ="hello"
//
//var gama: String? = null


//fun getGreeting() = "Hello Kotlin"
//
//fun sayHello(): Unit{
//    println(getGreeting())
//}

fun sayHello(greeting:String,vararg itemToGreet:String)
{
    itemToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


//fun sayHello(itemToGreet:String){
//    val msg ="Molo  $itemToGreet"
//    println(msg)
//    println("Hello Kotlin")
//}

fun greetPerson(greeting: String ="Hello", name:String ="Kotlin"){
    println("$greeting $name")
}

fun main(){

//    sayHello(greeting = "Hey" ,itemToGreet = "Cyfo")
//    sayHello(greeting="Hello",itemToGreet = "World")

    val interestingThings = arrayOf("Kotiln","Programming","Comic Books")
    sayHello(greeting="Hi", *interestingThings)


greetPerson()


//    println("Hello World ")
//    println(getGreeting())
//    sayHello()

//   greeting ="hi"
//
//    if(gama != null)
//    {
//        println(greeting)
//    }else{
//        println(greeting)
//    }

//    when(gama){
//        null -> println("Hello")
//        else -> println(greeting)
//    }

//    greeting = "hello"
//    val greetingToprint = if(greeting !=null) greeting else "Hi"
//





//  println(name)
//


//    val intrestingThings = arrayOf("Kotlin","Programing","Comic Books")
//
//
//
//    println(intrestingThings.size)
//    println(intrestingThings[0])
//    println(intrestingThings.get(0))
//    println("")

//    for(intrestringThing in intrestingThings)
//    {
//        println(intrestringThing)
//    }

//    intrestingThings.forEach {
//        println(it)
//    }


//    intrestingThings.forEachIndexed{index, intrestingThing ->
//        println("$intrestingThing is at index $index")
//    }


//    val users= listOf("Machael","Sdudla","Vuyisa")
//    users.forEach{ user ->
//        println(user)
//    }

//    sayHello(greeting = "Hi",)
//
//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//
//    map.forEach{ key, value ->
//        println("$key -> $value")
//    }



}

