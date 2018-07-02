object decision {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //if example
  var hoursWorked = 40
  var rate = 10
  def earnings(h: Double): Double = {
    if(h <= 40)
      h * rate
    else
      (h - 40) * rate * 1.5 + 40 * rate
  }
  println("$" + earnings(hoursWorked))
  println("$" + earnings(30))
  println("$" + earnings(45))
  //match example with default
	}