package com.axis.dbconnection
import java.sql.DriverManager
fun main(args: Array<String>){
    var myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","Swarn@19")
    println("Connection established successfully")

    val stmt=connection.createStatement()
    val del_res=stmt.executeUpdate("delete from users where id=4")

    if(del_res>0){
        println("Successfully deleted users db!!!!")
        println("$del_res rows deleted")
    }
    else{
        println("Deletion failed")
    }
}
