package Exercise2

object Main extends App {

  val bank = new Bank
  val account = Account(0, 0)
  val makeDeposit = account.deposit(1000)

  println(makeDeposit)
  println(bank.accounts)
}