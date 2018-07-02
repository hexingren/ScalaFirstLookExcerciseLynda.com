object employee {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet")
  
  case class Employee(val id: String, val fName: String, val lName: String) {
    override def toString: String = {
      "Employee id: " + id + "\nFull Name: " + fName + " " + lName}
  };$skip(383); 
  
  val employeeList = List(Employee("12401", "Scott", "Simpson"),
                          Employee("12402", "Will", "Smith"),
                          Employee("12403", "Hexing", "Ren"));System.out.println("""employeeList  : List[employee.Employee] = """ + $show(employeeList ));$skip(59); 
                          
  employeeList.foreach(println);$skip(52); 
  val ee1 = Employee("12334", "Rogers", "Samantha");System.out.println("""ee1  : employee.Employee = """ + $show(ee1 ));$skip(21); 
  println(ee1.lName)}
}
