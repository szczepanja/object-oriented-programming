import org.scalatest._
import flatspec._
import matchers._

class SenderSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Sender"

  it should """send message with given header of value "header"""" in {
    val sender = Sender("header")
    sender.send("message") shouldBe ("header \n message")
    sender.send("another message") shouldBe ("header \n another message")
  }

}