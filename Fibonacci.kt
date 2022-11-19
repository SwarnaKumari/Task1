import java.util.*
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter value:")
    var number=reader.nextInt()
    var temp1=0
    var temp2=1
    println("Fibonacci series till $number are:")
    for(i in 1..number){
        println("$temp1")
        val sum=temp1+temp2
        temp1=temp2
        temp2=sum
    }
}