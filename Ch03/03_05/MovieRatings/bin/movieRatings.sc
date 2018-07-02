object movieRatings {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var movie_ratings = Map("Finding Nemo" -> "G",
                          "Finding Dory" -> "PG",
                          "Men in Black" -> "PG-13",
                          "The Avengers" -> "PG-13")
                                                  //> movie_ratings  : scala.collection.immutable.Map[String,String] = Map(Finding
                                                  //|  Nemo -> G, Finding Dory -> PG, Men in Black -> PG-13, The Avengers -> PG-13
                                                  //| )
  var rating = movie_ratings("The Avengers")      //> rating  : String = PG-13
  println(rating)                                 //> PG-13
  movie_ratings.foreach(println)                  //> (Finding Nemo,G)
                                                  //| (Finding Dory,PG)
                                                  //| (Men in Black,PG-13)
                                                  //| (The Avengers,PG-13)
  movie_ratings += "Harry Potter and the Sorcerer's Stone" -> "PG"
  movie_ratings.foreach(println)                  //> (The Avengers,PG-13)
                                                  //| (Men in Black,PG-13)
                                                  //| (Finding Nemo,G)
                                                  //| (Finding Dory,PG)
                                                  //| (Harry Potter and the Sorcerer's Stone,PG)
}