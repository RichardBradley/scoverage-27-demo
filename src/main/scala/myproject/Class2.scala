package myproject

class Class2 {

  def sayHelloBill(): String = {
    new Helper().sayHelloBill()
  }

  class Helper {
    def sayHelloBill(): String = {

      val bill = new NamedObject {
        // This line is not covered by tests:
        override def name = "Bill"
      }

      NamedObject.sayHello(bill)
    }
  }
}
