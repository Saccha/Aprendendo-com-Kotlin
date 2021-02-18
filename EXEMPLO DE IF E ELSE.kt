/*Exemplo 1*/

var temperatura = 12

fun main(){
   if (temperatura >= 21) {
   print("Pode vestir roupas leves hoje\n")
   } else {
    print("Melhor levar um casaco\n")
   }
}

/*Exemplo 2*/
fun main(){
   if temperatura >= 21 {
      print("Pode vestir roupas leves hoje\n")
   } else if (temperatura <= 12){
      print("Você precisa mesmo sair de casa? Está muito frio lá fora!\n")
   }else {
      print("Melhor levar um casaco\n")
   }
}

/*Exemplo 3*/

fun main(args: Array<String>){
   val nota: Double = 8.3
   if(nota >= 7.0){
      pritln("Aprovado")
   }else{
      pritln("Reprovado")
   }
}





