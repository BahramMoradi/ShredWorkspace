package ch3_object_orintation_in_scala

/**
 * Created by BAM on 18-08-2016.
 */
/**
 * This class generate a getter method for title , remember that val are imutable so there is no setter method for the title
 * the getter method i public
 */
class Book( val title: String){

  override def toString():String=title
}

/**
 * By declaring fields as var  a public getter and setter is created for the fields. var are mutable and can be changed
 */
class Player(var id: Long,var name:String){
  override def toString():String=id+" "+name
}

/**
 * id and name are declared as private val , they can not be accessed from the outside of the class but stil can be accessed from inside
 * as you can see the print method inside the class can access the fields of the user class
 */
class User(private val id:Long,private val name:String){

  def printUser(user:User): Unit ={
    println(this.id+" "+this.name)
    println(user.id+" "+user.name)
  }
  override def toString():String=id+" "+name
}

class Employee(id:Long,name:String){
  override def toString():String=s"Employee [id : $id  name: $name]"
};



object  Main{
  def main(args: Array[String]) {
    /**
    println(new Book("Begning Scala"))

    val p=new Player(10,"Dany")
    println(p)
    p.name="Messi"
    println(p)

    line
    pr ("Testing class user with private val")
    val user=new User(1,"Bahram")
    println(user)

    user.printUser(new User(10,"Dany"))
    pr(user)
    **/
    line()
    val dan=new Employee(12,"Dany");
   // pr(dan.id)   //you can not access the id  parameter because it is private
    pr(dan)

  }
  def line():Unit=println("-------------------------------------------------------")
  def pr(str:Any):Unit=println(str)
}