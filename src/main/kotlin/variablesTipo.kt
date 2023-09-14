fun main(){
    //variables y tipos de datos Kotlin
    // val para constantes
    // avr para variables

    val name = "Santiago Montiel"
    var age = 20

    print("Hi, I'm $name and I'm ")
    println("$age años ")

    // name = "si" las variables val no cambian (inmutables)
    age = 21
    age += 10

    //age = "diez" Variables var cambian de valor pero de no de tipo
    // Especificar Tipo de Dato en declaración

    // Declaración
    val city: String
    // Inicialización
    city= "Apizaco"

    //Decalaracion e inicialización
    val isMarried: Boolean = false

    val cars: Int = 0
    val height: Double = 1.68

    println(isMarried)
    println(height)

    // String Templates
    // $ para imprimir valor de variables
    // ${} para procesos antes de imprimir
    println("Hola soy $name y tengo $age años")
    println("Vivo en $city, tengo $cars carros")


    println(" En 2030 tendré ${ cars + 3 } 🚘🚘🚘 ")
}