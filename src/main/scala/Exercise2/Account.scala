package Exercise2

case class Account(balance: Int, number: Int) {

  def printStatus: String = s"""balance: $balance, number: $number"""

  def makeDeposit(amount: Int, id: Int): Account = Account(balance + amount, id)

  def withdrawMoney(amount: Int, id: Int): Any = balance match {
    case b if b <= amount => println(printStatus)
    case _ => Account(balance - amount, id)
  }
}
