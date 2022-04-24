package Exercise2

case class Account(balance: Int, number: Int) {

  def transfer(amount: Int, fromAccount: Int, toAccount: Int): Any = balance match {
    case b if b < amount => printStatement
    case _ =>
      Account(balance + amount, fromAccount)
      Account(balance - amount, toAccount)
  }

  def printStatement: String = s"""balance: $balance, number: $number"""

  def makeDeposit(amount: Int, id: Int): Account = Account(balance + amount, id)

  def withdrawMoney(amount: Int, id: Int): Any = balance match {
    case b if b <= amount => printStatement
    case _ => Account(balance - amount, id)
  }
}
