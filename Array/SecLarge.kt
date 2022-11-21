package ArrayTask
import java.util.*
fun main(args: Array<String>)
{
    var scan=Scanner(System.`in`)
    println("Enter size of array:")
    var mysize=scan.nextInt()
    var numbers=Array(mysize,{0})
    println("Enter elements into array:")
    for(i in 0..(mysize-1)){
        numbers.set(i,scan.nextInt())
    }
    println("Elements in array:")
    for(i in 0..mysize-1) {
        println("${numbers[i]}")
    }
    numbers.sortDescending()
    println("Second largest element in array:${numbers[1]}")

}
