open class Employee(name:String,age:Int,salary:Int){
    init{
        println("Name is $name")
        println("Age is $age")
        println("Salary is $salary")
    }
}
class Programmer(name:String,age:Int,salary:Int):Employee(name,age,salary){
    fun doProgram(){
        println("Programming is my passion.")
    }
}
class Salesman(name:String,age:Int,salary:Int):Employee(name,age,salary){
    fun fieldWork(){
        println("Travelling is my hobby")
    }
}
fun main(args: Array<String>){
    val obj1=Programmer("Swarna",22,60000)
    obj1.doProgram()
    val obj2=Salesman("Chandini",21,30000)
    obj2.fieldWork()
}