// In Scala, there's a special type of class called a Case Class.
// Case Classes are defined similar to a class, but instead, they 
// add the `case` keyword before the class keyword. By doing that, 
// it automatically does the equivalent of the following: 
// it prepends `val` to all parameters making them immutable instance values.
// It creates equals in hash code methods so that instances of that class
// can safely be used in collections.

// It creates a companion object of the same name with an apply method 
// with the same arguments as declared for the class. This allows creation
// of instances without using the `new` keyword and with an apply method
// to allow the class name to be used as an extractor in case statements. 
// Case classes are immutable by default, decomposable through pattern matching, 
// compared by structural equality instead of by reference, succinct to instantiate 
// and operate on.

object caseclasses {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  case class Money(val amount: Int = 1, val currency: String = "USD") {
    // define a function called '+' to add two money objects
    def +(other: Money): Money = Money(amount + other.amount)
  }
  // creates a money object with 1 USD
  val defaultAmount = Money()                     //> defaultAmount  : caseclasses.Money = Money(1,USD)
  // creates a money object with 5 USD
  val fiveDollars = Money(5)                      //> fiveDollars  : caseclasses.Money = Money(5,USD)
  // creates a money object with 5 USD
  val fiveDollars2 = Money(5, "USD")              //> fiveDollars2  : caseclasses.Money = Money(5,USD)
  // creates a money object with 1 EUR
  val euros = Money(currency = "EUR")             //> euros  : caseclasses.Money = Money(1,EUR)
  
  // copy to make a new Money object
  val tenDollars = euros.copy(10)                 //> tenDollars  : caseclasses.Money = Money(10,EUR)
  val tenDollars2 = tenDollars.copy(currency = "USD")
                                                  //> tenDollars2  : caseclasses.Money = Money(10,USD)
  
  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"))
                                                  //> moneyList  : List[caseclasses.Money] = List(Money(1,USD), Money(50,GBP), Mon
                                                  //| ey(45,EUR))
  
  // use the + definition above
  println("add 10 + 15: " + { Money(10, "USD") + Money(15, "USD")})
                                                  //> add 10 + 15: Money(25,USD)
}