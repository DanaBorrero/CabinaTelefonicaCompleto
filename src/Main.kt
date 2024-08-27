fun main() {

    var opc: Int
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
                    val cabinaIndex = readln().toInt() - 1

                    if (cabinaIndex in cabinas.indices) {
                        val cabinaSeleccionada = cabinas[cabinaIndex]
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
                                    cabinaSeleccionada.numLlam()
                                    println(cabinaSeleccionada.cosTotal(50))
                                }

                                2 -> {
                                    println("***Llamada larga distancia***")
                                    cabinaSeleccionada.numLlam()
                                    println(cabinaSeleccionada.cosTotal(350))

                                }

                                3 -> {
                                    println("***Llamada celular***")
                                    cabinaSeleccionada.numLlam()
                                    println(cabinaSeleccionada.cosTotal(150))
                                }
                            }
                        } while (opc1 != 4)
                    }else {
                        println("Selección inválida.")
                    }
                    println("Saliendo del programa...")
                }
            }
            3 -> {
                cabinas.forEach{ it.listarCabina()}
            }
            4 ->{
                println("Limpiando datos de cabinas")
                cabinas.clear()
            }

        }
    }while (opc != 5)
    println("Gracias por usar nuestro servicio \nVuelva pronto :)")

}


