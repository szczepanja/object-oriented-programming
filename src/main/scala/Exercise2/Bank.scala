package Exercise2

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class Bank {

  var accounts: ArrayBuffer[Account] = ArrayBuffer.empty[Account]

  def openAccount(newAccount: Account): mutable.Seq[Account] = accounts += newAccount

}

object Main extends App {

  val mBank = new Bank

  println(mBank.openAccount(Account(0, 1)))
}