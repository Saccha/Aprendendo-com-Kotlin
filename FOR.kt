/*Examples*/

/*Itera sobre um Intervalo Fixo*/
fun main(args: Array<String>) {
  for(i in 1..10) {
  println(i)
  }
}

/*Itera sobre um Intervalo Fixo (Decrescente)*/
fun main(args: Array<String>) {
  for(i in 10 downTo 1) {
  println("i = $i")
  }
}

/*Itera sobre um Intervalo Fixo (Com Passo)*/
fun main(args: Array<String>) {
  for(i in 0..100 step 5) {
  println(i)
  }
  for(i in 100 downTo 0 step 5) {
  println(i)
  }
}
