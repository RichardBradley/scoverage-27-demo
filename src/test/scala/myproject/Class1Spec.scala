package myproject

import org.specs2.mutable.Specification

class Class1Spec
  extends Specification {

  "Class1" should {

    "sayCurrentTimeTwice" in {
      new Class1().sayCurrentTimeTwice()
      ok
    }
  }
}
