package myproject

/**
 * A simple interface to demonstrate
 * https://github.com/scoverage/scalac-scoverage-plugin/issues/27
 */
trait NamedObject {

  def name: String
}

object NamedObject {
  def sayHello(to: NamedObject): String =
    "Hello, " + to.name
}
