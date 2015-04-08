package myproject

import java.util.Date
import MyDsl._

class Class1 {
  def sayCurrentTimeTwice(): Unit = {
    // qq
    scoverage.Invoker.invoked(6, "E:\\Work\\Metaswitch\\scoverage-27-demo\\target\\scala-2.11/scoverage-data")

    val now = new Date()
    twice {
      println("Class1: it is now " + now)
    }
  }
}
