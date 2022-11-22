fun main(args: Array<String>){
    val duck=Duck()
    duck.fly()
    duck.swim()
}
open class Bird{
    fun fly(){
        println("Flying")
    }
}
class Duck:Bird(){
    fun swim(){
        println("Swimming")
    }
}
