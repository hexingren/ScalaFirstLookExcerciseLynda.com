// a tuple is a small, ordered collection of objects where each object
// can have a different type. Unlike lists and arrays, however, there's
// no way to iterate through elements in a tuple. Tuples start with the
// index value of one. Arrays and lists start at zero.
object tuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(329); 
  println("Welcome to the Scala worksheet");$skip(34); 
  val tuple = (1, false, "Scala");System.out.println("""tuple  : (Int, Boolean, String) = """ + $show(tuple ));$skip(53); 
  val tuple2 = "computer" -> "Dell Pavilion Desktop";System.out.println("""tuple2  : (String, String) = """ + $show(tuple2 ));$skip(54); 
  // tuples start index of 1
  val second = tuple2._2;System.out.println("""second  : String = """ + $show(second ));$skip(20); 
  val t = "a" -> 25;System.out.println("""t  : (String, Int) = """ + $show(t ));$skip(53); 
  def div10(n: Int): Tuple2[Int, Int] = (n/10, n%10);System.out.println("""div10: (n: Int)(Int, Int)""");$skip(31); 
  val (tens, ones) = div10(85);System.out.println("""tens  : Int = """ + $show(tens ));System.out.println("""ones  : Int = """ + $show(ones ));$skip(33); 
  println("tens digit: " + tens);$skip(33); 
  println("ones digit: " + ones)}
}
