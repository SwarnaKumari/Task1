fun main()
{
    var fruits=mutableListOf<String>("apple","mango","papaya")
    println(fruits)
    fruits.add("Orange")
    fruits.add("Banana")
    println(fruits)
    println("size of list ${fruits.size}")
    println("Contains apple ${fruits.contains("apple")}")
    println("Contains pineapple  ${fruits.contains("pineapple")}")
}