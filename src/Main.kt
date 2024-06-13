fun main() {
    println(birthdayGreeting("rover",11))
    println("---------------------------  ")
    println(birthdayGreeting("Rex",12))
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}