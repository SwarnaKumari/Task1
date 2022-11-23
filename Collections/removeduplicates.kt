fun main(){
    var javabatch=mutableListOf<String>("anil","gopal","ankit","manish")
    var kotlinbatch=mutableListOf<String>("ankit","kumar","manish","rahul")
    javabatch.addAll(kotlinbatch)
    println("After combining: ${javabatch}")
   println("After removing duplicate eleemnts:${javabatch.distinct()}")
    var newbatch=javabatch.toSet()
    javabatch.sort()
    println("After sorting:${newbatch}")


}