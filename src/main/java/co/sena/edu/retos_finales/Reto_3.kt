package co.sena.edu.retos_finales

class Reto_3 {
}

fun main() {
    var autos= mutableListOf("Lamborñini","camioneta","audi","convertible")

    println("Quieres ingresar al sistema del control de los autos del conselsonario, si es asi escribe la palabra si")
    var palabra: String= readLine()!!.toString()

    while (palabra=="si"){

    println("Elige una de es 5 opciones para los carros")
    println("Si eliges 1 podras agregar un carro \n, si eliges 2 podras ver todos los autos\n, si eliges 3 podras buscar un auto en particular\n,si elijes 4 podras modicar un vehiculo\n y si eliges 5 quitar vehiculos\n")
    var opcion= readLine()!!.toInt()

    if (opcion==1){
        println("AGREGA UN NUEVO CARRO")
        var carro= readLine()!!.toString()
        autos.add(carro)
        for((index, auto)in autos.withIndex()){
            println("la autos No. $index es $auto")
        }

    }else if (opcion == 2){
        for((index, auto)in autos.withIndex()){
            println("la autos No. $index es $auto")
        }
    }else if (opcion == 3){
        println("BUSCA DE VEHICULO EN REGISTRO DEL CARRO")
        var buscar= readLine()!!.toInt()

       if (buscar in 0 until  autos.size){
           println("El auto $buscar es el vehiculo ${autos[buscar]}")
        }else{
            println("El auto $buscar no se encuetra en la lista")
        }

    } else if (opcion==4){
        for((index, auto)in autos.withIndex()){
            println("los autos No. $index es $auto")
        }
        println("MODIFICA UNO DE LOS AUTOS")
        println("Elije un numero de carro")
        var num = readLine()!!.toInt()

        if (num in 0 until  autos.size){
            println("Ingresa nuevo nombre para el auto")
            var nombre= readLine()!!.toString()

            autos[num]=nombre
            println("Nombre de vehiculo modificado")
            for((index, auto)in autos.withIndex()){
                println("la autos No. $index es $auto")
            }
        }else{
            println("el numero que ingresaste es incorrecto")
        }
    }else if(opcion==5){
        for((index, auto)in autos.withIndex()){
            println("los autos No. $index es $auto")
        }
        println("ELIMINA UNO DE LOS AUTOS")
        println("Elije un numero de carro")
        var num = readLine()!!.toInt()

        if (num in 0 until  autos.size){
            println("Ingresa nombre para eliminar auto")
            var nombre= readLine()!!.toString()

            autos.remove(nombre)
            println("Vehiculo Eliminado")
            for((index, auto)in autos.withIndex()){
                println("la autos No. $index es $auto")
            }
        }else{
            println("el numero que ingresaste es incorrecto")
        }
    }else{
        println("Esa opcion no existe")
    }

        println("Quieres volver a ingresar, escribe si")
        palabra= readLine()!!.toString()
    }
}


