package myproject

import org.specs2.mutable.Specification

class Class1Spec
  extends Specification {

  "Class1" should {

    "say hello world" in {
      new Class1().sayHelloWorld() mustEqual "Hello, World"
    }
  }
}
