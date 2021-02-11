/* As funções são declaradas com a palavra-chave fun. Para os parâmetros, você deve declarar não apenas seus nomes, mas também seus tipos, 
e você deve declarar o tipo de valor que a função pretende retornar. 
O corpo da função geralmente é um bloco, que é colocado entre chaves:
Examples*/

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
}


/*Example1*/
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2 
}
fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}
