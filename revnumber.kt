import java.util.*
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter number:")
    var number=reader.nextInt()
    var reverse=0
    while(number!=0){
        var rem=number%10
        reverse = reverse*10+rem
        number /= 10
    }
    println("Reverse number is $reverse")
}