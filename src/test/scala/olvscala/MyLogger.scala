package olvscala

;

class MyLogger(val logger: String) {


  def info(log: String): Unit = {
    println(s"$logger: $log")
  }

  def info(template: String, args: Any*): Unit = {
    println(s"$logger: $template")
  }

  def error(throwable: Throwable, message: String, args: Any*): Unit = {
    println(s"$logger:")
    println(throwable.getMessage)
    println(message)
  }
}