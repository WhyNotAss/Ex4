fun main()
{
    println("Введите два числа и знак операции через пробел")
    val line = readLine()!!
    val parts = line.split(" ")
    val num1 = parts[0].toDouble()
    val num2 = parts[2].toDouble()
    val op = parts[1][0]
    val result = when (op)
    {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> 0.0
    }
    println("Результат: $result")
}
