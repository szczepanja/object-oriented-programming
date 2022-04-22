package Exercise2

case class Bank(accounts: Array[Account]) {

  def transfer(howMuch: Int, fromAccount: Account, toAccount: Account): Account = Account(50, 2)

}
