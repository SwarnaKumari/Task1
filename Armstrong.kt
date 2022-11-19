import java.util.*
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter three digit number:")
    var number=reader.nextInt()
    var temp=number
    var result=0
    while(number!=0){
        var rem=number%10
        result+=rem*rem*rem
        number /= 10
    }
    if(result==temp)
    println("$temp is an armstrong number")
    else{
        println("$temp is not an armstrong number")
    }
}