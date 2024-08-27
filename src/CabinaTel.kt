import kotlin.random.Random

class CabinaTel(var nomCab: String) {
    // Lista para almacenar llamadas realizadas en esta cabina
   val llamadas: MutableList<Llamada> = mutableListOf()

    // Variables que almacenan los datos de la llamada actual
    var numero: Int = 0
    var minTotal: Int = 0
    var cosTotal: Int = 0

    // Método para crear una nueva cabina
    fun crearCabina(): CabinaTel {
        println("Ingrese el nombre de la nueva cabina: ")
        val numCab = readln().toString()
        println("Cabina creada con nombre: $numCab")
        return CabinaTel(numCab)
    }

    // Método para ingresar el número de teléfono y realizar la llamada
    fun numLlam() {
        println("Ingrese el número de teléfono que desea: ")
        numero = readln().toInt()
        println("Llamando al número $numero desde la cabina $nomCab.")
    }

    // Método para calcular el costo de la llamada
    fun cosTotal(valor: Int) {
        minTotal = Random.nextInt(1, 101)
        println("Minutos asignados a esta llamada: $minTotal")
        cosTotal = minTotal * valor
        println("El costo total de la llamada es de: $cosTotal")

        // Guardar la llamada en la lista de llamadas
        llamadas.add(Llamada(numero, minTotal, cosTotal))
    }

    // Método para listar las llamadas realizadas en esta cabina
    fun listarCabina() {
        println("Cabina: $nomCab")
        if (llamadas.isEmpty()) {
            println("No hay llamadas registradas en esta cabina.")
        } else {
            println("Llamadas registradas:")
            llamadas.forEachIndexed { index, llamada ->
                println("${index + 1}. Número: ${llamada.numeroTelefono}, Duración: ${llamada.duracion} minutos, Costo: ${llamada.costo} pesos")
            }
        }
    }

    // Representación en texto de la cabina
    override fun toString(): String {
        return "CabinaTel(nomCab='$nomCab')"
    }
    // Clase interna para representar una llamada
    data class Llamada(val numeroTelefono: Int, val duracion: Int, val costo: Int)

}





