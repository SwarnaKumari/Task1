import java.util.*
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter number:")
    var number=reader.nextInt()
    var temp=number
    var reverse=0
    while(number!=0){
        var rem=number%10
        reverse = reverse*10+rem
        number /= 10
    }
    if(temp==reverse){
        println("Given number $temp is palindrome")
    }
    else{
        println("Given number $temp is not a palindrome")
    }
}