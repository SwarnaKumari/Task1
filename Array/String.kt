fun main(args: Array<String>){
    var name="swarna"
    var name2="swarnakumari"
    println(name)
    println(name[0])
    println(name[1])
    println("length of string:${name.length}")
    println("string indices:${name.indices}")
    println("Last index of string:${name.lastIndex}")
    val ch=charArrayOf('h','e','l','l','o')
    val st=String(ch)
    println(st)
    println(name.get(4))
    println(name.subSequence(2,5))
    println(name.compareTo(name2))
    //escaped string
    var str="my \n name is \n swarna"
    println(str)
    //raw string
    var str2="""My 
        |is
        |chandini""".trimMargin()
    println(str2)
}
