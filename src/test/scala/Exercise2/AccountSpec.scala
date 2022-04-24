package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

class AccountSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Account"
  val account1: Account = Account(0, 1)
  val account2: Account = Account(10000, 2)

  "account.print" should "print a statement for an account" in {
    account1.printStatus shouldBe "balance: 0, number: 1"
    account2.printStatus shouldBe "balance: 10000, number: 2"
  }

  "account.deposit" should "increase number of balance by deposit" in {
    account1.makeDeposit(100) shouldBe Account(100, 1)
    account2.makeDeposit(1000) shouldBe Account(11000, 2)
  }

}
