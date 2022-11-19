fun main(){
    var first=10
    var second=20
    println("Before swap")
    println("First number=$first")
    println("Second number=$second")
    first=first-second
    second=first+second
    first=second-first
    println("After swap")
    println("First number:$first")
    println("Second number:$second")

}