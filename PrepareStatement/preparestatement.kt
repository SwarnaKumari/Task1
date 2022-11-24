package com.axis.dbconnection
import java.sql.DriverManager
import java.util.Scanner
fun main(args: Array<String>){
    var myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","Swarn@19")
    println("Connection established successfully")

    println("Enter values to insrt into users table")
    var sc=Scanner(System.`in`)
    println("Enter id:")
    var id=sc.nextInt()
    println("Enter name:")
    var name=sc.next()

    val prestmt=connection.prepareStatement("insert into users values(?,?)")
    prestmt.setInt(1,id)
    prestmt.setString(2,name)
    val result=prestmt.executeUpdate()

    if(result>0){
        println("Successfully inserted record into users db!!!")
    }
    else{
        println("Insert Not successful")
    }
}
