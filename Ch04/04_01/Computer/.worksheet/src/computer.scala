object computer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet")

// Classes in Scala are similar to classes in Java.
// They're blueprints that describe an object, providing
// fields and methods. One difference is that classes can
// have parameters.

// lists can be made up of objects
class Computer(val make: String, val model: String, val ram: String) {
  override def toString: String = ("[" + make + ", " + model + ", " + ram + "]\n")
};$skip(622); 

val computers = List(new Computer("Dell", "Laptop", "16GB"),
                     new Computer("Dell", "Desktop", "32GB"),
                     new Computer("Mac", "Mini", "8GB"),
                     new Computer("HP", "Notebook", "16GB"));System.out.println("""computers  : List[computer.Computer] = """ + $show(computers ));$skip(70); 

// use first to get first element in list
val first = computers.head;System.out.println("""first  : computer.Computer = """ + $show(first ));$skip(82); 

// use tail to get everything except the first element
val rest = computers.tail;System.out.println("""rest  : List[computer.Computer] = """ + $show(rest ))}
}
