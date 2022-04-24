package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

class AccountSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Account"
  val account1: Account = Account(0, 1)
  val account2: Account = Account(10000, 2)

  "account.print" should "can print a statement for an account" in {
    account1.printStatement shouldBe "balance: 0, number: 1"
    account2.printStatement shouldBe "balance: 10000, number: 2"
  }

  "account.deposit" should "increase number of balance by given deposit" in {
    account1.makeDeposit(100, account1.number) shouldBe Account(100, 1)
    account2.makeDeposit(1000, account2.number) shouldBe Account(11000, 2)
  }

  "account.withdrawMoney" should "withdraw typed amount of money from picked bank account" in {
    account2.withdrawMoney(5000, account2.number) shouldBe Account(5000, 2)
  }

  it should "return bank account status when there is not enough money to withdraw" in {
    account1.withdrawMoney(1000, account1.number) shouldBe account1.printStatement
  }

  "account.transfer" should "transfer money from one account to another" in {
    account2.transfer(1000, account2.number, account1.number) shouldBe Account(9000, 1)
  }

  it should "return bank account status when there is not enough money to transfer" in {
    account1.withdrawMoney(1000, account2.number) shouldBe account1.printStatement
  }

}
