package myproject

/**
 * An example DSL to demo https://github.com/scoverage/scalac-scoverage-plugin/issues/27
 */
object MyDsl {

  /**
   * Runs the given block twice, returning the second value
   */
  def twice[T](block: => T): T = {
    block
    block
  }
}
