// Sets are iterables that contain no duplicate elements.
// They automatically have access to the methods contains,
// apply, and subset of.
object sets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val fruit = Set("apple", "orange", "peach", "banana")
                                                  //> fruit  : scala.collection.immutable.Set[String] = Set(apple, orange, peach, 
                                                  //| banana)
  fruit("peach")                                  //> res0: Boolean = true
  fruit("potato")                                 //> res1: Boolean = false
  var s = Set(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)       //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  s += 6
  println(s)                                      //> Set(5, 1, 6, 2, 3, 4)
  if (s.isEmpty)
    println("Set was empty")
  else
    println(s.head)                               //> 5
  println(s.tail)                                 //> Set(1, 6, 2, 3, 4)
  fruit ++ s                                      //> res2: scala.collection.immutable.Set[Any] = Set(peach, 5, banana, 1, 6, oran
                                                  //| ge, 2, 3, apple, 4)
  val s1 = Set(1, 2, 3)                           //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  s1.&(s)                                         //> res3: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

// A map is a collection of key value pair. Any value can be
// retrieved based on its key. Keys are unique in the map, but
// does not need to be unique. The default Scala map class is
// immutable. This means that you can pass an instance of map
// to another thread, and that thread can access the map without
// worrying about syncronizing.
  var g = Map(1->"Milk", 2->"Bread", 3->"Juice", 4->"Eggs")
                                                  //> g  : scala.collection.immutable.Map[Int,String] = Map(1 -> Milk, 2 -> Bread,
                                                  //|  3 -> Juice, 4 -> Eggs)
  g(1)                                            //> res4: String = Milk
  g.get(1)                                        //> res5: Option[String] = Some(Milk)
  g = g + (5->"Hashbrowns")
  println(g)                                      //> Map(5 -> Hashbrowns, 1 -> Milk, 2 -> Bread, 3 -> Juice, 4 -> Eggs)
  g.get(6)                                        //> res6: Option[String] = None
  g.getOrElse(7, "No match")                      //> res7: String = No match
}