/*
Strings possuem diversos métodos associados;
indexação, concatenação, comparação,formatação;
Pode ser concatenada com plus/+;
Também é tratado com um array de char;
Para concatenar uma variável a uma String, os súmbolos ${} deveme ser inseridos

Capitalize() -> é quando escrevemos a primeira palavra com sua letra maiúscula e o resto das letras em minúsculas

toUpperCase() -> retorna o valor da string original convertido em letras maiúsculas

toLowerCase() -> O método toLowerCase() retorna o valor da string que foi chamada convertido para minúsculo.
                 Uma nova string contendo o valor da string original convertido para minúsculo.
                 O método toLowerCase() retorna o valor da string original convertido para minúsculo.
                 
decapitalize() -> Retorna uma cópia desta string com a primeira letra em minúscula usando as regras do local padrão, 
                  ou a string original se estiver vazia ou já começar com uma letra minúscula.
                  
                  
Indexação
String como array; 
First() , last() , String.lenght , String[index]

Examples*/

fun main(){
  val welcome = "Bem vindo(a)"
  var name = "Usuário"
  println("$welcome , ${name.capitalize()}")
}

/*Comparação*/

fun main() {
    val s1 = "Eagle"
    val s2 = "eagle"
    if (s1 == s2) {
        println("Strings are equal")
    }  else {
        println("Strings are not equal")
    }
    println("Ignoring case")
    val res = s1.compareTo(s2, true)
    if (res == 0) {
        println("Strings are equal")
    }  else {
        println("Strings are not equal")
    }
}

/*Concatenação*/
fun main(){
  val welcome = "Ola"
  val name = "Usuário"
  println(welcome + " " + name)
}

/*Formatação

Capitalização de strings  -->  Alterar a formatação entre letras minúsculas e maiúsculas
                               Métodos: capitalize() ; toUpperCase() ; toLowerCase() ; decapitalize()

Remoção de espaços  -->  Remove espaços vazios e caracteres inadequados para impressão
                         Métodos: trimEnd() ; trimStart() ; trim()

Substituição de caracteres -->  Substituir caracteres por outros
                                Métodos: replace(x,y)
                                
Formatação  --> Formatar outros valores para um padrão de string
                Métodos: "padrão
                          ${valor}".format(valor)






