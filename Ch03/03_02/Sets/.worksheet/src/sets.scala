// Sets are iterables that contain no duplicate elements.
// They automatically have access to the methods contains,
// apply, and subset of.
object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(199); 
  println("Welcome to the Scala worksheet");$skip(56); 
  val fruit = Set("apple", "orange", "peach", "banana");System.out.println("""fruit  : scala.collection.immutable.Set[String] = """ + $show(fruit ));$skip(17); val res$0 = 
  fruit("peach");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(18); val res$1 = 
  fruit("potato");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(44); 
  var s = Set(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(9); 
  s += 6;$skip(13); 
  println(s);$skip(73); 
  if (s.isEmpty)
    println("Set was empty")
  else
    println(s.head);$skip(18); 
  println(s.tail);$skip(13); val res$2 = 
  fruit ++ s;System.out.println("""res2: scala.collection.immutable.Set[Any] = """ + $show(res$2));$skip(24); 
  val s1 = Set(1, 2, 3);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(10); val res$3 = 
  s1.&(s);System.out.println("""res3: scala.collection.immutable.Set[Int] = """ + $show(res$3));$skip(406); 

// A map is a collection of key value pair. Any value can be
// retrieved based on its key. Keys are unique in the map, but
// does not need to be unique. The default Scala map class is
// immutable. This means that you can pass an instance of map
// to another thread, and that thread can access the map without
// worrying about syncronizing.
  var g = Map(1->"Milk", 2->"Bread", 3->"Juice", 4->"Eggs");System.out.println("""g  : scala.collection.immutable.Map[Int,String] = """ + $show(g ));$skip(7); val res$4 = 
  g(1);System.out.println("""res4: String = """ + $show(res$4));$skip(11); val res$5 = 
  g.get(1);System.out.println("""res5: Option[String] = """ + $show(res$5));$skip(28); 
  g = g + (5->"Hashbrowns");$skip(13); 
  println(g);$skip(11); val res$6 = 
  g.get(6);System.out.println("""res6: Option[String] = """ + $show(res$6));$skip(29); val res$7 = 
  g.getOrElse(7, "No match");System.out.println("""res7: String = """ + $show(res$7))}
}
