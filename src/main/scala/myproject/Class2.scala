package myproject

import java.util.Date
import MyDsl._

class Class2 {
  def sayCurrentTimeTwice(): Unit = {
    val now = new Date()
    twice {
      println("Class2: it is now " + now)
    }
  }
}
