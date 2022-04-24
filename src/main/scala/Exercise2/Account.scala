package Exercise2

case class Account(balance: Int, number: Int) {

  def printStatus: String = s"""balance: $balance, number: $number"""

  def makeDeposit(amount: Int): Account = Account(balance + amount, number)
}
