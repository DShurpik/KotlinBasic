package codewars.lvl8

fun main() {
    println(rps("scissors", "paper"))
    println(rps1("scissors", "scissors"))
}

fun rps(p1: String, p2: String): String {
    if (p1.equals("scissors") && p2.equals("paper") || p1.equals("paper") && p2.equals("rock")
        || p1.equals("rock") && p2.equals("scissors")
    ) {
        return "Player 1 won!";
    } else if (p1.equals(p2) || p2.equals(p1)) {
        return "Draw!";
    } else {
        return "Player 2 won!";
    }
}

fun rps1(p1: String, p2: String): String {

    return when {
        (p1 == p2) -> "Draw!"
        (p1 == "scissors" && p2 == "paper") -> "Player 1 won!"
        (p1 == "rock" && p2 == "scissors") -> "Player 1 won!"
        (p1 == "paper" && p2 == "rock") -> "Player 1 won!"
        else -> "Player 2 won!"
    }

}