package com.axis.dbconnection
import java.sql.DriverManager
fun main(args: Array<String>){
    var myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","Swarn@19")
    println("Connection established successfully")

    val stmt=connection.createStatement()
    val res=stmt.executeUpdate("insert into product values(3,'fridge',40000)")

    if(res>0){
        println("Successfully inserted record into product db!!!")
    }
    else{
        println("Insert Not successful")
    }
}
