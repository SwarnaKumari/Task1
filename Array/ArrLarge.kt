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
    println("Elements of array:")
    for(i in 0..mysize-1) {
        println("${numbers[i]}")
    }
    // numbers.sort()
    // println("Largest number in array:${numbers.last()}")
    var ls=numbers.toList()
    println("Largest number in array:${ls.max()}")
    var large=numbers[0]
    for(i in 0..(mysize-1)){
        if(numbers[i]>large){
            large=numbers[i]
        }
    }
    println("Minimum number=${large}")
}
