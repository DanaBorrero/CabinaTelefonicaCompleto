fun main() {

    var opc: Int
    var cab : Int = 0
    var nL = CabinaTel("")
    var cabinas: MutableList<CabinaTel> = mutableListOf()

    do{
    println("------ CABINA TELEFONICA ------")
    println("Elija la opcion que desea: \n 1. Crear cabina" +
                                       "\n 2. Realizar una llamada"+
                                       "\n 3. Listar informacion cabinas" +
                                       "\n 4. Reiniciar cabinas" +
                                       "\n 5. Salir")

        opc = readln().toInt()
        when (opc) {
            1 -> {
                val nuevaCabina = nL.crearCabina()
                cabinas.add(nuevaCabina)
            }
            2 -> {
                if (cabinas.isEmpty()) {
                    println("No hay cabinas creadas. Por favor, cree una cabina primero.")
                } else {
                    println("Seleccione la cabina para realizar la llamada:")
                    cabinas.forEachIndexed { index, cabina ->
                        println("${index + 1}. Cabina ${cabina.nomCab}")
                    }
                    do {
                        println("***Realizar una llamada***")
                        println(
                            "¿Que tipo de llamada desea realizar?: \n 1. Llamada local........................$50 pesos" +
                                    "\n 2. Llamada larga distancia..............$350 pesos" +
                                    "\n 3. Llamada celular......................$150 pesos" +
                                    "\n 4. Regresar al menu anterior"
                        )
                        var opc1: Int = readln().toInt()
                        when (opc1) {
                            1 -> {
                                println("***Llamada local***")
                                nL.numLlam()
                                println(nL.cosTotal(50))
                            }

                            2 -> {
                                println("***Llamada larga distancia***")
                                nL.numLlam()
                                println(nL.cosTotal(350))

                            }

                            3 -> {
                                println("***Llamada celular***")
                                nL.numLlam()
                                println(nL.cosTotal(150))
                            }
                        }
                    } while (opc1 != 4)
                    println("Saliendo del programa...")
                }
            }
            3 -> {
                nL.listarCabina()
            }

        }
    }while (opc != 5)
    println("Gracias por usar nuestro servicio \nVuelva pronto :)")
}


