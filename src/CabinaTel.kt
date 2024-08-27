import kotlin.random.Random

class CabinaTel(var nomCab: String) {
    var crearCab : MutableList<CabinaTel> = mutableListOf()
    val minTotal = Random.nextInt(1,101)
    var numero : Int = 0
    var cosTotal : Int = 0

    fun crearCabina(): CabinaTel {
        println("Ingrese el nombre de la nueva cabina: ")
        val numCab = readln().toString()
        val cabina = CabinaTel(numCab)
        crearCab.add(cabina)
        println("Cabina creada con número: $numCab")
        return cabina
    }
    fun numLlam() {
        println("Ingrese el número de teléfono que desea: ")
        numero = readln().toInt()
        println("Llamando al número $numero desde la cabina $nomCab.")
    }

    fun cosTotal(valor: Int){
        println("Minutos asignado a esta llamada: $minTotal")
        cosTotal = minTotal*valor
        println("El costo total de la llamada es de: $cosTotal")
    }

    fun listarCabina() {
        println("Cabina: $nomCab")
        if (crearCab.isEmpty()) {
            println("No hay llamadas registradas en esta cabina.")
        } else {
            println("Llamadas registradas:")
            crearCab.forEachIndexed { index, llamada ->
                println("${index + 1}. Número: ${llamada.numero}, Duración: ${llamada.minTotal} minutos, Costo: ${llamada.cosTotal(0)} pesos")
            }
        }
    }
    override fun toString(): String {
        return "CabinaTel(nomCab='$nomCab', crearCab=$crearCab, minTotal=$minTotal, numero=$numero, cosTotal=$cosTotal)"
    }


}




