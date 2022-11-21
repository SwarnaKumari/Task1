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
       println("Element[$i]:")
        numbers.set(i,scan.nextInt())
    }
    println("Elements of array:")
    for(i in 0..mysize-1) {
        println("${numbers[i]}")
    }
   // numbers.sort()
   // println("Smallest number in array:${numbers.first()}")
    var ls=numbers.toList()
    println("Smallest number in array:${ls.min()}")
    var small=numbers[0]
    for(i in 0..(mysize-1)){
        if(numbers[i]<small){
            small=numbers[i]
        }
    }
    println("Minimum number=${small}")
}
