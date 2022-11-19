import java.util.*
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter number")
    var number=reader.nextInt()
    var factorial=1
    for(i in 1..number){
        factorial*=i
    }
    println("Factorail of given number is $factorial")

}