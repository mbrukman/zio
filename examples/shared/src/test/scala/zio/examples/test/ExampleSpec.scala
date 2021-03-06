package zio.examples.test

import zio.test.{ assert, suite, test, Assertion, DefaultRunnableSpec }

object ExampleSpec extends DefaultRunnableSpec {

  def spec = suite("some suite")(
    test("failing test") {
      assert(1)(Assertion.equalTo(2))
    },
    test("passing test") {
      assert(1)(Assertion.equalTo(1))
    },
    test("multiline strings not equal") {
      assert("foo bar\nbazz buzzard")(Assertion.equalTo("bar foo\nbazard"))
    },
    test("multiline string expected to be single line") {
      assert("Hello,\nWorld!")(Assertion.equalTo("Hello, World!"))
    }
  )
}
