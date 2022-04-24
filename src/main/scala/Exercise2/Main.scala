package Exercise2

object Main extends App {

  val bank = new Bank
  val account1 = bank.openAccount(Account(0, 1))
  val account2 = bank.openAccount(Account(0, 2))

  val firstAccount = bank.accounts.head
  val secondAccount = bank.accounts(1)
  val makeDeposit = firstAccount.makeDeposit(10000, firstAccount.number)
  val withdraw = makeDeposit.withdrawMoney(5000, firstAccount.number)
  val makeTransfer = makeDeposit.transfer(5000, firstAccount.number, secondAccount.number)

}