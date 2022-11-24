package com.axis.dbconnection
import java.sql.DriverManager
fun main(args: Array<String>){
    var myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","Swarn@19")
    println("Connection established successfully")

    val stmt=connection.createStatement()
    val update_res=stmt.executeUpdate("update users set name='saha' where id=4")
    if(update_res>0){
        println("Successfully updated record in users db!!!")
        println("$update_res rows updated")
    }
    else{
        println("Update not successfully")
    }
}
