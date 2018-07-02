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

object caseclasses {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(990); 
  println("Welcome to the Scala worksheet")
  
  case class Money(val amount: Int = 1, val currency: String = "USD") {
    // define a function called '+' to add two money objects
    def +(other: Money): Money = Money(amount + other.amount)
  };$skip(271); 
  // creates a money object with 1 USD
  val defaultAmount = Money();System.out.println("""defaultAmount  : caseclasses.Money = """ + $show(defaultAmount ));$skip(68); 
  // creates a money object with 5 USD
  val fiveDollars = Money(5);System.out.println("""fiveDollars  : caseclasses.Money = """ + $show(fiveDollars ));$skip(76); 
  // creates a money object with 5 USD
  val fiveDollars2 = Money(5, "USD");System.out.println("""fiveDollars2  : caseclasses.Money = """ + $show(fiveDollars2 ));$skip(77); 
  // creates a money object with 1 EUR
  val euros = Money(currency = "EUR");System.out.println("""euros  : caseclasses.Money = """ + $show(euros ));$skip(74); 
  
  // copy to make a new Money object
  val tenDollars = euros.copy(10);System.out.println("""tenDollars  : caseclasses.Money = """ + $show(tenDollars ));$skip(54); 
  val tenDollars2 = tenDollars.copy(currency = "USD");System.out.println("""tenDollars2  : caseclasses.Money = """ + $show(tenDollars2 ));$skip(71); 
  
  val moneyList = List(Money(), Money(50, "GBP"), Money(45, "EUR"));System.out.println("""moneyList  : List[caseclasses.Money] = """ + $show(moneyList ));$skip(103); 
  
  // use the + definition above
  println("add 10 + 15: " + { Money(10, "USD") + Money(15, "USD")})}
}
