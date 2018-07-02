// a tuple is a small, ordered collection of objects where each object
// can have a different type. Unlike lists and arrays, however, there's
// no way to iterate through elements in a tuple. Tuples start with the
// index value of one. Arrays and lists start at zero.
object tuples {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val tuple = (1, false, "Scala")                 //> tuple  : (Int, Boolean, String) = (1,false,Scala)
  val tuple2 = "computer" -> "Dell Pavilion Desktop"
                                                  //> tuple2  : (String, String) = (computer,Dell Pavilion Desktop)
  // tuples start index of 1
  val second = tuple2._2                          //> second  : String = Dell Pavilion Desktop
  val t = "a" -> 25                               //> t  : (String, Int) = (a,25)
  def div10(n: Int): Tuple2[Int, Int] = (n/10, n%10)
                                                  //> div10: (n: Int)(Int, Int)
  val (tens, ones) = div10(85)                    //> tens  : Int = 8
                                                  //| ones  : Int = 5
  println("tens digit: " + tens)                  //> tens digit: 8
  println("ones digit: " + ones)                  //> ones digit: 5
}