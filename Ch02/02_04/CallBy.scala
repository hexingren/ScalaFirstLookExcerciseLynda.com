object CallBy {
	def something() = {
		println("inside calling something")
		5
	}
	def callByValue(x: Int) = {
		println("call by value: ")
		println("x1 = " + x)
		println("x2 = " + x)
	}
	callByValue(something())
	def callByName(x: => Int) = {
		println("call by name: ")
		println("x1 = " + x)
		println("x2 = " + x)
	}
	callByName(something())
}