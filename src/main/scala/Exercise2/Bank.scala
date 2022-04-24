package Exercise2

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class Bank {

  var accounts: ArrayBuffer[Account] = ArrayBuffer.empty[Account]

  def openAccount(newAccount: Account): mutable.Seq[Account] = accounts += newAccount

  def closeAccount(closeAccount: Account): mutable.Seq[Account] = accounts -= closeAccount

}

object Main extends App {

  val bank = new Bank

  println(bank.openAccount(Account(0, 1)))
  println(bank.closeAccount(Account(0, 1)))
  println(bank.accounts)
}