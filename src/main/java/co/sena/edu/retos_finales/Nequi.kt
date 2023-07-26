@file:Suppress("UNUSED_EXPRESSION")

package co.sena.edu.retos_finales

class Nequi {
}

fun codigo(){
    var num1:Int=(100000..999999).random()


    println("Tu codigo es $num1")
}

fun main() {


    var contador:Int=3
    var saldo:Int=4500
    var retirar:Int=0

    while (contador>=1){
        println("BIENVENIDO A NEQUI")
        println("Para iniciar a nequi ingresa tu nombre usuario")
        var N_User: String= readLine()!!.toString()
        println("Ingresa tu contraseña que es de 4 digitos numericos")
        var clave:Int= readLine()!!.toInt()

    if (N_User=="luis" && clave==4515){
        println("Tu datos son correctos puedes acceder")
        var palabra:String="correcto"


        while(palabra=="correcto"){

            var seguir:String="si"
            println("Saldo actual es $saldo")
            println("--MENU--")
            println("En este menu puedes tienes control del nequi solo oprimiendo una tecla")
            println("1.s para sacar dinero")
            println("2.e para enviar dinero")
            println("3.r para recargar")
            println("4.sa para salir de nequi")

            var letra:String= readLine()!!.toString()

            if(letra=="s"){
                //sacar plata
                println("si quiere sacar su dinero por cajero oprima c o si quiere por punto fisico oprima p")
                var opcion:String= readLine()!!.toString()

                if (opcion=="c" || opcion=="p"){
                    if (saldo<2000){
                        println("No te alcanza tu saldo es de $saldo")
                    }else{
                        println("Cuanto vas  a retirar")
                        retirar = readLine()!!.toInt()
                        saldo=saldo-retirar

                        codigo()
                        println("valor a retirar $retirar")
                    }
                }else{
                    println("Esa opcion de retiro no existe")
                }
            }else if (letra=="e"){
                //Enviar dinero
                println("Si vas enviar dinero, ingresa un numero de telefono")
                var telefono= readLine()!!.toLong()
                println("Cuanto vas a enviar")
                retirar= readLine()!!.toInt()
                saldo=saldo-retirar

                if (saldo<2000){
                    println("No te alcanza por que tu saldo es de $saldo")
                }else{
                    println("Valor enviado es $retirar se envio al numero $telefono")
                }
            }else if (letra=="r"){
                //Recargar
                println("Ingresa el valor que vas a recargar")
                retirar= readLine()!!.toInt()
                saldo=saldo+retirar

                println("Deseas recargar este valor")
                var confirmar:String= readLine()!!.toString()

                if (confirmar=="si"){
                    println("Muy bien recargaste $saldo en tu cuenta")
                }else{
                    println("Se cancela recarga")
                }
            }else {
                println("Ok, que tengas buen dia")
                palabra = "salir"
                contador=contador-3
            }
        }
    }else{
        println("Lo siento el usuario $N_User es incorrecto y la clave $clave es incorrecta")
        contador = contador - 1
        println("Tienes $contador intentos")

        while (contador==0){
            println("Se bloqueara tu cuenta, tu cuenta se reactivara pasadas 24 horas")
            contador=contador-3
        }
    }
        println("Gracias por visitarnos")
    }

}