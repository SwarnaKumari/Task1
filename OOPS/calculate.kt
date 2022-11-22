package Oops
import java.util.*
fun main(args: Array<String>){
    var reader=Scanner(System.`in`)
    println("Enter n1 value:")
    var n1=reader.nextInt()
    println("Enter n2 value:")
    var n2=reader.nextInt()
    var cal=Calculate(n1,n2)
    println("Enter your choice\n1.Add\n2.Subtract\n3.Multiplication\n4.Division\n")
    var choice=reader.nextInt()
    when(choice){
        1->cal.add()
        2->cal.sub()
        3->cal.mul()
        4->cal.div()
        else->println("Invalid option")
    }

}
class Calculate(n1:Int,n2:Int){
    var n1:Int=n1
    var n2:Int=n2
    fun add(){
        var res=n1+n2
        println("additionof two numbers=$res")
    }
    fun sub(){
        var res=n1-n2
        println("subtraction of two numbers=$res")
    }
    fun mul(){
        var res=n1*n2
        println("Multiplication of two numbers=$res")
    }
    fun div(){
        var res=n1/n2
        println("Division of two numbers=$res")
    }

}