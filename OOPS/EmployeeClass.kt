package Oops
fun main(args: Array<String>){
     var emp=Employee(1,"swarna",20000,28)
    emp.dis()
     println("per day salary:${emp.calculatePerDaySalary()}")
     println("total salary:${emp.totalSalaryEarned()}")

}
class Employee{
    var id:Int=0
    var name:String=""
    var salary:Int=0
    var noOfDaysPresent:Int=0
    constructor(id:Int,name:String,salary:Int,noOfDaysPresent:Int){
        this.id=id
        this.name=name
        this.salary=salary
        this.noOfDaysPresent=noOfDaysPresent
    }
    fun calculatePerDaySalary():Int{
        return salary/30
    }
    fun totalSalaryEarned():Int{
        var sal=calculatePerDaySalary()
        return noOfDaysPresent*sal
    }
    fun dis()
    {
        println("$id  $name $salary $noOfDaysPresent")
    }
}
