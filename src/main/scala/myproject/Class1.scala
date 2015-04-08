package myproject

class Class1 {

  def sayHelloWorld(): String = {

    val world = new NamedObject {
      // This line is covered by tests:
      override def name = "World"
    }

    NamedObject.sayHello(world)
  }
}
