/*isBlank
Retorna verdadeiro se esta string estiver vazia ou consistir apenas em caracteres de espaço em branco.*/
Example*/
import java.util.Locale
import kotlin.test.*

fun main(args: Array<String>) {
    fun validateName(name: String): String {
        if (name.isBlank()) throw IllegalArgumentException("Name cannot be blank")
        return name
    }

    println(validateName("Adam")) // Adam
    // validateName("") //  will fail
    // validateName("  \t\n") //  will fail
    
    

/*ifBlank
Retorna essa sequência de caracteres se não estiver vazia e não consistir apenas em caracteres de espaço em branco ou o 
resultado da chamada da função defaultValue de outra forma.
Example*/
import java.util.Locale
import kotlin.test.*

fun main(args: Array<String>) {
    val blank = "    "

    val blankOrNull: String? = blank.ifBlank { null }
    println(blankOrNull) // null

    val blankOrDefault = blank.ifBlank { "default" }
    println(blankOrDefault) // default

    val nonBlank = "abc"
    val sameString = nonBlank.ifBlank { "def" }
    println("nonBlank === sameString is ${nonBlank === sameString}") // true
}


/*isNullOrBlank
Retorna verdadeiro se esta sequência de caracteres anulável for nula ou vazia ou 
consistir apenas em caracteres de espaço em branco.
Example*/

import java.util.Locale
import kotlin.test.*

fun main(args: Array<String>) {
    fun validateName(name: String?): String {
        if (name.isNullOrBlank()) throw IllegalArgumentException("Name cannot be blank")
        // name is not nullable here anymore due to a smart cast after calling isNullOrBlank
        return name
    }

    println(validateName("Adam")) // Adam
    // validateName(null) //  will fail
    // validateName("") //  will fail
    // validateName("  \t\n") //  will fail
}

/*Empty
Um intervalo vazio de valores do tipo Long.

isEmpty
Retorna verdadeiro se esta sequência char estiver vazia (não contém caracteres).
example*/

import java.util.Locale
import kotlin.test.*

fun main(args: Array<String>) {
    fun markdownLink(title: String, url: String) =
    if (title.isEmpty()) url else "[$title]($url)"

    // plain link
    println(markdownLink(title = "", url = "https://kotlinlang.org")) // https://kotlinlang.org

    // link with custom title
    println(markdownLink(title = "Kotlin Language", url = "https://kotlinlang.org")) // [Kotlin Language](https://kotlinlang.org)

/*isNullOrEmpty
Retorna verdadeiro se esta sequência char anulável for nula ou vazia.
Example*/

import java.util.Locale
import kotlin.test.*

fun main(args: Array<String>) {
    fun markdownLink(title: String?, url: String) =
    if (title.isNullOrEmpty()) url else "[$title]($url)"

    // plain link
    println(markdownLink(title = null, url = "https://kotlinlang.org")) // https://kotlinlang.org

    // link with custom title
    println(markdownLink(title = "Kotlin Language", url = "https://kotlinlang.org")) // [Kotlin Language](https://kotlinlang.org)
}


















