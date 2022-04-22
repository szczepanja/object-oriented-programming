package Exercise1

import org.scalatest.flatspec._
import org.scalatest.matchers._

class SenderSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Sender"

  val sender: Sender = Sender("header")

  it should """send message with given header of value "header"""" in {
    sender.send("message") shouldBe ("header \n message")
    sender.send("another message") shouldBe ("header \n another message")

  }

}