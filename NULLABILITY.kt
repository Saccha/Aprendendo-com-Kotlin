/*
Qualquer tipo pode ser nulo, porém isso deve ser explicitado na declaração de variável através do uso de interrogação(?);
A inferência de tipo não atribui nullability;
*/

var month:Int? = null
//Atribui valor null corretamente a month
var day:Int = null
/*Erro de compilação
"Null can not be a value of a non-null type Int*/
