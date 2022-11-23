package Collections
class Employee(id:Int,name:String,dept:String,salary:Int,age:Int){
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var salary:Int=salary
    var age:Int=age
}
fun main(){
    var employees=mutableListOf<Employee>()
    employees.add(Employee(1,"swarna","hr",35000,22))
    employees.add(Employee(2,"chandini","bench",25000,21))
    employees.add(Employee(3,"anuja","hr",40000,25))
    for(employee in employees){
        println("${employee.id}  ${employee.name}  ${employee.dept}  ${employee.salary}  ${employee.age}")
    }
}
