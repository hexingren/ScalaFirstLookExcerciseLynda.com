object movieRatings {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(205); 
  var movie_ratings = Map("Finding Nemo" -> "G",
                          "Finding Dory" -> "PG",
                          "Men in Black" -> "PG-13",
                          "The Avengers" -> "PG-13");System.out.println("""movie_ratings  : scala.collection.immutable.Map[String,String] = """ + $show(movie_ratings ));$skip(45); 
  var rating = movie_ratings("The Avengers");System.out.println("""rating  : String = """ + $show(rating ));$skip(18); 
  println(rating);$skip(33); 
  movie_ratings.foreach(println);$skip(67); 
  movie_ratings += "Harry Potter and the Sorcerer's Stone" -> "PG";$skip(33); 
  movie_ratings.foreach(println)}
}
