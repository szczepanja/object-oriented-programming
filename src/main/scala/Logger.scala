import scala.io.StdIn.readLine

object Logger extends App {

  val prefix = readLine("Define prefix: ")
  val msg = readLine("Define message: ")
  val logger = Logger(prefix)
  logger.print(msg)

}

case class Logger(pref: String) {
  def print(message: String): String = pref + " " + message
}

