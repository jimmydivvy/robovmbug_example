package robovmbug
 
import argonaut._, Argonaut._

object Main {
  def main(args: Array[String]) {
    "foo".decodeOption[Person]
  }
}

class Main{}

