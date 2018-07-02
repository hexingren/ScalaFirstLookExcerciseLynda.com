object employee {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  case class Employee(val id: String, val fName: String, val lName: String) {
    override def toString: String = {
      "Employee id: " + id + "\nFull Name: " + fName + " " + lName}
  }
  
  val employeeList = List(Employee("12401", "Scott", "Simpson"),
                          Employee("12402", "Will", "Smith"),
                          Employee("12403", "Hexing", "Ren"))
                                                  //> employeeList  : List[employee.Employee] = List(Employee id: 12401
                                                  //| Full Name: Scott Simpson, Employee id: 12402
                                                  //| Full Name: Will Smith, Employee id: 12403
                                                  //| Full Name: Hexing Ren)
                          
  employeeList.foreach(println)                   //> Employee id: 12401
                                                  //| Full Name: Scott Simpson
                                                  //| Employee id: 12402
                                                  //| Full Name: Will Smith
                                                  //| Employee id: 12403
                                                  //| Full Name: Hexing Ren
  val ee1 = Employee("12334", "Rogers", "Samantha")
                                                  //> ee1  : employee.Employee = Employee id: 12334
                                                  //| Full Name: Rogers Samantha
  println(ee1.lName)                              //> Samantha
}