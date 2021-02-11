/* 
Os comandos compareTo retornam os valores -1 (menor que) , 0 (igual) ou 1 (maior).Já os operadores retornam valores booleanos
O comando equals retorna um booleano

Maior/Menor:
a > b ou a < b
a.compareTo(b) > 0 ou a.compareTo(b) < 0

Maior/Menor/Igual
a >= b ou a <= b
a.compareTo(b) >= 0 ou a.compareTo(b) =< 0

Igual 
a == b
a.equals(b)
*/
/*Examples*/

const val EQUAL = 0
const val LESS = -1
const val MORE = 1
//função principal
fun main(){
  val d = 220
  val t = 219
  println( d >= t)
  println(d.compareTo(t) == EQUAL)
