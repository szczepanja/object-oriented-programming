package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

class AccountSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Account"
  val account1: Account = Account(10000, 1)
  val account2: Account = Account(22000, 2)

  "account.print" should "print a statement for an account" in {
    account1.print shouldBe "balance: 10000, number: 1"
    account2.print shouldBe "balance: 22000, number: 2"
  }

}