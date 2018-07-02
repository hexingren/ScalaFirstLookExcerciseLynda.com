// An array is a common data structure consisting of a
// collection of elements of the some type. The same type
// can be anything from any to AnyVal to specific types,
// such as ints, doubles, et cetera. Elements are associated
// with an index, usually an integer, which is used to access
// or replace a particular element.
object arrays {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(388); 
  println("Welcome to the Scala worksheet");$skip(52); 
  var movies: Array[String] = new Array[String] (5);System.out.println("""movies  : Array[String] = """ + $show(movies ));$skip(53); 
  movies(0) = "Harry Potter and The Sorcerers Stone";$skip(70); 
  
  var furniture = Array("Chair", "Sofa", "Table", "Bed", "Rocker");System.out.println("""furniture  : Array[String] = """ + $show(furniture ));$skip(18); 
  println(movies);$skip(21); 
  println(movies(0));$skip(21); 
  println(furniture);$skip(24); 
  println(furniture(0));$skip(73); 
  def print(strArray: Array[String]): Unit = {strArray.foreach(println)};System.out.println("""print: (strArray: Array[String])Unit""");$skip(16); 
  print(movies);$skip(19); 
  print(furniture);$skip(34); 
  
  var t = new Array[AnyVal](3);System.out.println("""t  : Array[AnyVal] = """ + $show(t ));$skip(11); 
  t(0) = 1;$skip(14); 
  t(1) = true;$skip(13); 
  t(2) = 3.0;$skip(21); 
  t.foreach(println);$skip(11); 
  t(0) = 5;$skip(17); 
  t.update(0, 5)}
}
