case class Test(value: String)

object Test {

  extension (test: Test) {
    def upper: Test = Test(test.value.toUpperCase)
  }
}
