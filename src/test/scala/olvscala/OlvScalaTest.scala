package olvscala

class OlvScalaTest extends WithLogging {
  case class Message(text:String)
  val message = Message("|TEXT MSG|")
  //cases to test:
  val some= "|SOME"
  val args = List("A","B","C").toArray
  val arg1= "|ARG1|"
  val arg2= "|ARG2|"
  val exception = new RuntimeException("Some exception")
  log.info("some message")
  log.info(s"some message with $some")
  log.info(s"$some message with args")
  log.info(s"some ${message.text} with args")
  log info(s"Message with {} some text", args)
  log.info(s"Message with {} some text {} and,..", arg1, arg2)
  log.info(s"{} message with {}", arg1, arg2)
  log.error(exception, "message text")
  log.error(exception, "message text  $somevar")
  log.error(exception, "message text {} a {} b", arg1, arg2)

}

object OlvScalaTest extends App {
  new OlvScalaTest()
}