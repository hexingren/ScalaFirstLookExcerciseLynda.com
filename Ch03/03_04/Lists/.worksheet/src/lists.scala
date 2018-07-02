// Lists all the elements have the same type like arrays,
// but unlike arrays, elements of a list cannot be changed
// by assignment. Lists are immutable. Since Scala stores
// everything as objects, the concept of declaring all elements
// with the same data type is quite different from other languages.
// For example, a list can have an int, a double, and boolean since
// they are all of type AnyVal.
object lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(465); 
  println("Welcome to the Scala worksheet");$skip(36); 
  val empty: List[Nothing] = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(29); 
  var a = List(3.0, "Hello");System.out.println("""a  : List[Any] = """ + $show(a ));$skip(34); 
  var x1 = List(1, 2, 3, 4, 5, 6);System.out.println("""x1  : List[Int] = """ + $show(x1 ));$skip(33); 
  var x2 = 1::2::3::4::5::6::Nil;System.out.println("""x2  : List[Int] = """ + $show(x2 ));$skip(30); 
  var x3 = List.range(10, 20);System.out.println("""x3  : List[Int] = """ + $show(x3 ));$skip(32); 
  var x4 = List.range(3, 21, 3);System.out.println("""x4  : List[Int] = """ + $show(x4 ));$skip(46); 
  // merge lists using :::
  var x5 = x1:::x3;System.out.println("""x5  : List[Int] = """ + $show(x5 ));$skip(31); 
  var x6 = List.concat(x1, x3);System.out.println("""x6  : List[Int] = """ + $show(x6 ));$skip(25); 
  
  x1.foreach(println);$skip(14); 
  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(23); 
  x1.foreach(sum += _);$skip(15); 
  println(sum);$skip(85); 
  var rainbow = List("red", "orange", "yellow", "green", "blue", "indigo", "violet");System.out.println("""rainbow  : List[String] = """ + $show(rainbow ));$skip(36); 
  for (c <- rainbow)
    println(c);$skip(24); 
  var z = x1.map(_ * 2);System.out.println("""z  : List[Int] = """ + $show(z ))}
}
