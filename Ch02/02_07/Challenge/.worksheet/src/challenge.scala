object challenge {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(61); 
  val grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97);System.out.println("""grades  : List[Int] = """ + $show(grades ));$skip(333); 
  
  for(grade <- grades){
    val res = grade match {
      case i if (i >= 93 && i <= 100) => "A"
      case i if (i >= 86 && i <= 92) => "B"
      case i if (i >= 77 && i <= 85) => "C"
      case i if (i >= 69 && i <= 76) => "D"
      case i if (i >= 0 && i < 69) => "F"
      case _ => "Invalid Grade"
    }
    println(res)
  };$skip(38); 
  val sum = grades.foldLeft(0.0)(_+_);System.out.println("""sum  : Double = """ + $show(sum ));$skip(32); 
  val avg = sum / grades.length;System.out.println("""avg  : Double = """ + $show(avg ));$skip(15); 
  println(avg)}
}
