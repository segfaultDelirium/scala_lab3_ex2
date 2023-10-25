import scala.annotation.tailrec

def dup(s: String, n: Int): String = {
  @tailrec
  def dupRec(s: String,  n: Int, acc: String): String = {
    if n < 1 then return acc;
    dupRec(s, n - 1, acc + s);
  }
  
  dupRec(s, n, "");
}

@main def hello: Unit = {
  
  val res = dup("Hola, Ciao, Czesc ", 6);
  println(s"dup(\"Hola, Ciao, Czesc \", 6) = $res");
}
