package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

class BankSpec extends AnyFlatSpec with should.Matchers {

  val account1: Account = Account(0, 1)
  val account2: Account = Account(0, 2)
  val account3: Account = Account(0, 3)

  val bank: Bank = new Bank

  "bank.openAccount" should "open bank account with balance 0 and number 1" in {
    bank.openAccount(account1)
  }
  it should "open bank account with balance 0 and number 2" in {
    bank.openAccount(account2)
  }
  it should "open bank account with balance 0 and number 3" in {
    bank.openAccount(account3)
  }
  "bank.closeAccount" should "close bank account number 1" in {
    bank.closeAccount(account1)
  }
  it should "close bank account number 2" in {
    bank.closeAccount(account2)
  }
  it should "close bank account number 3" in {
    bank.closeAccount(account3)
  }
}