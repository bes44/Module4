package signature

/**
 * 1. Написать функцию возведения числа a в степень n.
2. Написать функцию, которая принимает два целых числа a и b (a<b). Она вычисляет произведение всех целых чисел от a до b включительно.
3. Написать функцию, которая принимает два целых числа a и b. Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
 */

fun power(a: Int, n: Int): Double {
    return Math.pow(a.toDouble(), n.toDouble())
}
fun product(a: Int, b: Int): Long {
    var result: Long = 1
    if (a < b) {
        for (i in a..b) {
            result *= i
        }
    }
    return result
}

fun divider(a: Int, b: Int): Int {
    var result: Int = 1
    if (a < b) {
        for (i in 1..b) {
            if (((a % i ) ==0) && (((b % i)==0))) result = i;
        }

    } else
        for (i in 1..a) {
            if (((a % i ) ==0) && (((b % i)==0))) result = i;
        }
    return result
}

fun main() {
    println("Задание 1")
    val base = 2
    val exponent = 3
    val result = power(base, exponent)
    println("$base^$exponent = $result")
    println("Задание 2")
    var a = 2
    var b = 10
    val result2 = product(a, b)
    println("Произведение всех целых чисел от $a до $b включительно = $result2")
    println("Задание 3")
    a = 18
    b = 24
    val result3 = divider(a, b)
    println("Общий делитель всех целых чисел от $a и $b  = $result3")
}