name:="sbt101"

lazy val emotions=settingKey[String]("How are you feeling")
emotions:="Fantastic"

val randomInt=taskKey[Int]("Give me Randmom Number")
randomInt:=scala.util.Random.nextInt()

//Dependency , run status in console
lazy val status=settingKey[String]("Current Status")
status:={
  val e=emotions.value
  s"Grateful $e"
}
