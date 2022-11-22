package exception
import java.lang.Exception
import java.util.InputMismatchException
import java.util.*
fun main(args: Array<String>){
    try {
        var reader = Scanner(System.`in`)
        println("Enter num1:")
        var num1 = reader.nextInt()
        println("Enter num2:")
        var num2 = reader.nextInt()
        try {
            var res = num1 / num2
            println(res)
        } catch (e: ArithmeticException) {
            println("num2 value should not be zero")
        }
    }
    catch(e:InputMismatchException) {
        println("enter only digit")
    }
}
