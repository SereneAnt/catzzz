package main.scala.catz

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Futures extends App {
  val z = Future.traverse(Seq(1, 2, 3))(x => Future(x))
}
