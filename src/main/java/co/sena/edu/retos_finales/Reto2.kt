package co.sena.edu.retos_finales

class Reto2 {
}

fun main() {

    println("Quieres ser una de las personas las que que les salga el descuento")

    println("Ingresa el precio producto")
    var precio: Int= readLine()!!.toInt()

    println("Ingresa la catidad que compraste")
    var cantidad: Int= readLine()!!.toInt()

    var result=precio*cantidad
    println("Tu total es $result")

    val palabra=""

    while (result >=50000 || palabra=="si"){

    var porc: Int=(1..3).random()
    var valor:Int=0

        if (porc==1){
            println("Sacaste la bolita roja")
            valor=result*10/100
            println("Te descuenta el 10% que es igual a $valor")
        }else if (porc==2){
            println("Sacaste la bolita azul")
            valor=result*30/100
            println("Te descuenta el 30% que es igual a $valor")
        }else if (porc==3){
            println("Sacaste la bolita amarilla")
            valor=result*50/100
            println("Te descuenta el 50% que es igual a $valor")
        }else{
            println("Sacaste la bolita blanca, te puedes llevar todas tus compras gratis")
        }

        println("Quieres volver a intentarlo")
        var palabra = readLine()!!.toString()
    }

}