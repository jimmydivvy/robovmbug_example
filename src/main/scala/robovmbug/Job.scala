package robovmbug

import argonaut._, Argonaut._

case class Person(    
    Name:String,
    Age:Int
)

object Person {
    implicit val personCodec = casecodec2(Person.apply, Person.unapply)("Name","Age")
} 