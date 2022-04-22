package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

class BankSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Bank"
  val account1: Account = Account(1000, 1)
  val account2: Account = Account(1000, 1)

  val bank: Bank = Bank(Array(account1, account2))

  "bank.transfer" should "transfer money from one account to another (only when there is enough money)" in {
    bank.transfer(50, account1, account2) shouldBe Account(50, 2)
  }
}