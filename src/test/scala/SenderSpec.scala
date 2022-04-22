import org.scalatest._
import flatspec._
import matchers._
import org.scalatest.exceptions.TestFailedException

class SenderSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Sender"

  val sender: Sender = Sender("header")

  it should """send message with given header of value "header"""" in {
    sender.send("message") shouldBe ("header \n message")
    sender.send("another message") shouldBe ("header \n another message")

  }

}