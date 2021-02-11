/*
Os operadores pode ser chamados tanto como expressão quanto como comando.O resultado será o mesmo
A função de soma também funciona para concatenar Strings;
*/
/*
SOMA:
expressão: a + b
comando: a.plus(b)
atribuição: a+=b

SUBTRAÇÃO:
expressão: a - b
comando: a.minus(b)
atribuição: a+=b

MULTIPLICAÇÃO:
expressão: a * b
comando: a.times(b)
atribuição: a *= b

DIVISÃO:
expressão: a / b
comando: a.div(b)
atribuição: a/= b

RESTO:
expressão: a % b
comando: a.mod(b)
atribuição: a %= b

*/
/*examples*/

fun main(){
    val count =  10
    var times = 9
    times += count
    println(times)
    println(count.plus(times))
}


