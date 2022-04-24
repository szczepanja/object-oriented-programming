package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

class AccountSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Account"
  val account1: Account = Account(0, 1)
  val account2: Account = Account(10000, 2)

  "account.print" should "print a status for an account" in {
    account1.printStatus shouldBe "balance: 0, number: 1"
    account2.printStatus shouldBe "balance: 10000, number: 2"
  }

  "account.deposit" should "increase number of balance by given deposit" in {
    account1.makeDeposit(100, 1) shouldBe Account(100, 1)
    account2.makeDeposit(1000, 2) shouldBe Account(11000, 2)
  }

  "account.withdrawMoney" should "withdraw typed amount of money from picked bank account" in {
    account2.withdrawMoney(5000, 2) shouldBe Account(5000, 2)
  }

  "account.withdrawMoney" should "return bank account status when there is not enough money to withdraw" in {
    account1.withdrawMoney(1000, 1) shouldBe print(account1.printStatus)
  }

}
