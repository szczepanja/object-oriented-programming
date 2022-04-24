package Exercise2

object Main extends App {

  val bank = new Bank
  val account = Account(1000, 0)
  val makeDeposit = account.makeDeposit(1000, 0)
  val withDraw = account.withdrawMoney(500, 0)

  println(makeDeposit)
  println(withDraw)

}