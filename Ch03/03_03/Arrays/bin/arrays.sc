// An array is a common data structure consisting of a
// collection of elements of the some type. The same type
// can be anything from any to AnyVal to specific types,
// such as ints, doubles, et cetera. Elements are associated
// with an index, usually an integer, which is used to access
// or replace a particular element.
object arrays {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var movies: Array[String] = new Array[String] (5)
                                                  //> movies  : Array[String] = Array(null, null, null, null, null)
  movies(0) = "Harry Potter and The Sorcerers Stone"
  
  var furniture = Array("Chair", "Sofa", "Table", "Bed", "Rocker")
                                                  //> furniture  : Array[String] = Array(Chair, Sofa, Table, Bed, Rocker)
  println(movies)                                 //> [Ljava.lang.String;@4411d970
  println(movies(0))                              //> Harry Potter and The Sorcerers Stone
  println(furniture)                              //> [Ljava.lang.String;@6442b0a6
  println(furniture(0))                           //> Chair
  def print(strArray: Array[String]): Unit = {strArray.foreach(println)}
                                                  //> print: (strArray: Array[String])Unit
  print(movies)                                   //> Harry Potter and The Sorcerers Stone
                                                  //| null
                                                  //| null
                                                  //| null
                                                  //| null
  print(furniture)                                //> Chair
                                                  //| Sofa
                                                  //| Table
                                                  //| Bed
                                                  //| Rocker
  
  var t = new Array[AnyVal](3)                    //> t  : Array[AnyVal] = Array(null, null, null)
  t(0) = 1
  t(1) = true
  t(2) = 3.0
  t.foreach(println)                              //> 1
                                                  //| true
                                                  //| 3.0
  t(0) = 5
  t.update(0, 5)
}