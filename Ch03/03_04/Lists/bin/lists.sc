// Lists all the elements have the same type like arrays,
// but unlike arrays, elements of a list cannot be changed
// by assignment. Lists are immutable. Since Scala stores
// everything as objects, the concept of declaring all elements
// with the same data type is quite different from other languages.
// For example, a list can have an int, a double, and boolean since
// they are all of type AnyVal.
object lists {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val empty: List[Nothing] = List()               //> empty  : List[Nothing] = List()
  var a = List(3.0, "Hello")                      //> a  : List[Any] = List(3.0, Hello)
  var x1 = List(1, 2, 3, 4, 5, 6)                 //> x1  : List[Int] = List(1, 2, 3, 4, 5, 6)
  var x2 = 1::2::3::4::5::6::Nil                  //> x2  : List[Int] = List(1, 2, 3, 4, 5, 6)
  var x3 = List.range(10, 20)                     //> x3  : List[Int] = List(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
  var x4 = List.range(3, 21, 3)                   //> x4  : List[Int] = List(3, 6, 9, 12, 15, 18)
  // merge lists using :::
  var x5 = x1:::x3                                //> x5  : List[Int] = List(1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                                                  //|  19)
  var x6 = List.concat(x1, x3)                    //> x6  : List[Int] = List(1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                                                  //|  19)
  
  x1.foreach(println)                             //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
  var sum = 0                                     //> sum  : Int = 0
  x1.foreach(sum += _)
  println(sum)                                    //> 21
  var rainbow = List("red", "orange", "yellow", "green", "blue", "indigo", "violet")
                                                  //> rainbow  : List[String] = List(red, orange, yellow, green, blue, indigo, vio
                                                  //| let)
  for (c <- rainbow)
    println(c)                                    //> red
                                                  //| orange
                                                  //| yellow
                                                  //| green
                                                  //| blue
                                                  //| indigo
                                                  //| violet
  var z = x1.map(_ * 2)                           //> z  : List[Int] = List(2, 4, 6, 8, 10, 12)
}