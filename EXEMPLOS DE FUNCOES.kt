//Exemplo 1

fun soma(a:Int , b:Int = 1): Int{
    return a + b
}
fun main(args: Array<String>){
    println(soma(2,3))
    println(soma(11,13))
}


//Exemplo 2
fun imprimirSoma(a:Int , b:Int){
    println(a+b)
}
fun main(args: Array<String>){
    imprimirSoma(4,5)
}
