import org.scalatest._
import flatspec._
import matchers._

class LoggerSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Logger"

  it should "print message with given prefix of +" in {
    val prefix_+ = Logger("+")
    prefix_+.print("message") shouldBe ("+ message")
    prefix_+.print("another: message") shouldBe ("+ another message")

  }

  it should "print message with given prefix of -" in {
    val prefix_- = Logger("-")
    prefix_-.print("another message") shouldBe ("- another message")
    prefix_-.print("another message") shouldBe ("- another message")
  }

  it should "print message with given prefix of /" in {
    val prefix_/ = Logger("/")
    prefix_/.print("another message") shouldBe ("/ another message")
    prefix_/.print("another message") shouldBe ("/ another message")
  }
}
