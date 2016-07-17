package olvscala


trait WithLogging {
  val log = new MyLogger(this.getClass.getName);
}