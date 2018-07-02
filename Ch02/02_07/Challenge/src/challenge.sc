object challenge {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97)
  
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
  }
  val sum = grades.foldLeft(0.0)(_+_) 
  val avg = sum / grades.length
  println(avg)  
}