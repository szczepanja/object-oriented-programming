package Exercise2

case class Account(balance: Int, number: Int) {
  def print: String = s"""balance: $balance, number: $number"""

}
