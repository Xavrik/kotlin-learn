var root : String = "Root"

fun main(args: Array<String>){

//    println("Hi Kotlin");
//    println("Hi guy")
//
//    var age: Int = 23
//    println("Возраст $age" )
//
//    age = 32
//    println(age)
//
//    var name : String = "Leo"
//
//    var firstChar : Char = 'A'
//
//    var isTrue : Boolean = false
//
//    var a: Int = -34
//    var char: Char = 'R'
//    var fl : Float = 23.093433f
//    var b : Int = 40000
//    var bool : Boolean = true
//    var c : Int? = null
//    val kons : Int = 45
//    root = "type"

//    var world: String? = null
//    var isHasCard = true
//
//    world = "Hello"

//    if(world == null){
//        println("Переменная world равна значению $world")
//    }else if(world.equals("Hello")){
//        println("Var $world")
//    }
//
//    else{
//        println("Переменная world не равна значению $world")
//    }
//
//   val number  = 2
////
////    when(number){
////        null -> print("Переменнтая равна нулю")
////        10 -> print("Переменнтая равна 10")
////        5 -> print("Переменнтая равна 5")
////        else -> print("unfordable")
////    }
//
//var res = if(number > 2) 1 else 0
//    println(res)
//
//    val words = when(number){
//        null -> "Nothing"
//        else -> number
//    }
//
//    println("word: " + words)
//
////
//    var a : Int? = 2;
//    var b : Int? = 3;
//    val range = 1 .. 100
//
//    if (a != null) {
//        if (a % 2 == 0){
//            println("четное $a");
//        } else println("четное $b")
//    }
//
//    var a : Int = 2
//    when (a){
//        3 -> println("Значения равно 3")
//        7 -> println("Значения равно 7")
//        else  -> println("Другое число")
//    }
//////////////////////////////////////////////////////////////////
    //////////////Array
    var items: Array<Int> = arrayOf(5,7,12,4,0,1)

    //val someArray = arrayOf(1)
    println(items.set(0,45))
    println(items[0])
    println(items.get(1))
    println(items.size)

//    for (i in items){
//        println(i)
//    }
    items.forEach {
        i -> println(i)
    }
    items.forEachIndexed{ index, i ->
        println("$i с индексом $index")
    }

    ///////////////ListOF, Map
    //var items_list = listOf(5,7,12,4,0,1)
    var items_List = mutableListOf<Any>()
    var dogs = listOf<Any>("Bob", "Sunny")
    items_List.add("Leo")
    items_List.addAll(4, dogs)

    //var items_map : Map<String,Any> = mapOf("name" to "Bob","age" to 1, "isHasCar" to true)

    var items_map = mutableMapOf("name" to "Bob","age" to 1, "isHasCar" to true)
    items_map ["city"] = "Bordo"
    items_map.forEach{key, value -> println("$key -> $value") }

/////////////////////Functon
sayHello("Hello", 45)
    var result = add( 3, 4)
    println(result)
    println(equalNum(5,3))


}

fun sayHello(first: String, number: Int){
    println("$first - $number")

}

fun add(x:Int, y: Int) : Int{
    var res = x+y;
    return res
}
fun saySomthing () : String{
    return "Hello World"
}

fun equalNum ( a: Int, b: Int): Char? {
    var ch:Char? = null;
    if(a<b )
        ch ='<'
    else if (a>b)
        ch = '>'
    else if(a==b)
        ch= '='
    return  ch;
}

fun printArray(items: List<Any>){
    items.forEach{
         i -> println(i)
    }

}
fun printMap (i : Map<String,Any>){
    i.forEach{
        key,value -> println("$key -> $value")
    }

}