
import java.util.*
fun main(){
    var leap = false
    var sc = Scanner(System.`in`)
    println("Enter year")
    val year:Int=sc.nextInt()
    if(year % 4 == 0){
        if(year % 100 == 0){
            //if year divisible by 400, then it is leap year
            leap = year % 400 == 0
        }
        else{
            leap=true
        }
    }
    else{
        leap=false
    }
    if(leap){
        println("$year is a leap year")
    }else
        println("$year is not a leap year2")

}