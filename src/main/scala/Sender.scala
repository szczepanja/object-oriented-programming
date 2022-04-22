import scala.io.StdIn.readLine

case class Sender(header: String) {
  def send(message: String): String = s"$header \n $message"
}

object Sender extends App {

  val header = readLine("Define header: ")
  val message = readLine("Define message: ")
  val sender = Sender(header)

  println(sender.send(message))

}
