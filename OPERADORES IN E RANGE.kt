/*
Se valor está presente em uma lista ou uma faixa(range) de valores;
Range cria um intervalo de valores que inicia no primeiro parâmetro e acaba no segundo 

-CONTÉM(IN)
-NÃO CONTÉM (!IN)
-RANGE/FAIXA DE VALORES(INT..INT)

Examples
*/

fun main (){
  val numbers = listOf(3,9,0,1,2)
  print(12 in numbers)
  //false
  print(12 in 0..20)
  //true
}

fun main(){
  val bingo = listOf(8,6,34,2,13)
  var number = 34
  println(number)
  println(number in bingo)
}


const val MIN_AGE = 16
const val MAX_AGE = 68
fun main(){
  var age = (10..100).random()
  println(age)
  println(age in MIN_AGE..MAX_AGE)
  println(age >= MIN_AGE && age <= MAX_AGE)
  
