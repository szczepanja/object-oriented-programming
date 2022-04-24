package Exercise2

import org.scalatest.flatspec._
import org.scalatest.matchers._

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class BankSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Bank"

  val bank: Bank = new Bank

  val account1: Account = Account(0, 1)
  val account2: Account = Account(0, 2)
  val account3: Account = Account(0, 3)

  val accounts: mutable.Seq[Account] = bank.accounts += account1 += account2 += account3

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

  "accounts" should "list how many bank accounts bank has" in {
    accounts shouldBe ArrayBuffer(Account(0, 1), Account(0, 2), Account(0, 3))
  }

  it should "list all bank accounts except deleted account number 1" in {
    bank.closeAccount(account1)
    accounts shouldBe ArrayBuffer(Account(0, 2), Account(0, 3))
  }

  it should "list all bank accounts with opened account number 1 and number 4" in {
    bank.openAccount(Account(0, 1))
    bank.openAccount(Account(0, 4))
    accounts shouldBe ArrayBuffer(Account(0, 2), Account(0, 3), Account(0, 1), Account(0, 4))
  }
}
