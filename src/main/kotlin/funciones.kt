fun main(){
    greetings()
    greetingsTo("Peter Parker")
    greetingsTo("Black Widow")
}
// Function without params and without return
fun greetings(){
    println("Greetings for everyone!")
}

fun greetingsTo(name: String){
    println("Hello $name")
    println("Welcome!")
}