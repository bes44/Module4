package accessModifiers

/**
1. Создать класс Registration с полями email и password. Для этого свойства email написать геттер,
который возвращает значение этого поля в верхнем регистре. Для поля password написать сеттер, который контролирует,
чтобы длина пароля была не менее 6 символов, иначе выводит сообщение, что не соответствует его длина.
2. Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.
3. Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
4. Написать функцию вывода в консоль положительных элементов массива. Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.
 */
class Registration(
    private var _email: String,
    private var _password: String
) {
    var email: String
        get() = _email.toUpperCase()
        private set(value) {
            _email = value
        }

    var password: String
        get() = _password
        set(value) {
            if (value.length < 6) {
                println("Длина пароля "+ value + " не соответствует требованиям (менее 6 символов)")
            } else {
                _password = value
            }
        }
}

fun findEvenNumbers(matrix: Array<IntArray>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] % 2 == 0) {
                evenNumbers.add(matrix[i][j])
            }
        }
    }
    return evenNumbers
}

fun fillMatrix(): Array<IntArray> {
    val matrix = Array(4) { IntArray(4) }
    var number = 1

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            matrix[i][j] = number++
        }
    }

    return matrix
}

fun printPositiveNumbers(array: IntArray) {
    fun isPositive(number: Int): Boolean {
        return number > 0
    }

    array.forEach { number ->
        if (isPositive(number)) {
            println(number)
        }
    }
}
fun main() {
    println("Задание 1")
    val registration = Registration("example@mail.com", "password123")
    println("Email: ${registration.email}")
    registration.password = "12345"
    registration.password = "newpassword"
    println("Password: ${registration.password}")
    println("Задание 2")
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )
    val evenNumbers = findEvenNumbers(matrix)
    println("Четные числа: $evenNumbers")

    println("Задание 3")
    val matrix2 = fillMatrix()
    matrix2.forEach { row ->
        println(row.joinToString(" "))
    }
    println("Задание 4")
    val array = intArrayOf(-3, 1, 4, -1, 5, -9, 2, 6, -5)
    printPositiveNumbers(array)
}
