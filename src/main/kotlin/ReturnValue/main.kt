package ReturnValue

/**
1. Написать функцию, на вход которой поступает массив из произвольного количества элементов. Данная функция проверяет,
если в массиве локальные минимумы и возвращает число локальных минимумов.
(локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).
2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел. Если в нем имеются отрицательные элементы,
то необходимо увеличить этот элемент на единицу и вернуть массив.
3. Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.
 */

fun countLocalMinima(array: IntArray): Int {
    if (array.size < 3) return 0

    var count = 0
    for (i in 1 until array.size - 1) {
        if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
            count++
        }
    }
    return count
}

fun processArray(array: IntArray): IntArray {
    for (i in array.indices) {
        if (array[i] < 0) {
            array[i] += 1
        }
    }
    return array
}
fun printKthRow(matrix: Array<IntArray>, k: Int) {
    if (k < 1 || k > matrix.size) {
        throw IllegalArgumentException("K выходит за пределы допустимых значений")
    }

    val kthRow = matrix[k - 1]
    println("Элементы $k-й строки: ${kthRow.joinToString(", ")}")
}


fun main() {
    println("Задание 1")
    val array = intArrayOf(5, 2, 7, 8, 1, 4)
    println("Количество локальных минимумов: ${countLocalMinima(array)}")
    println("Задание 2")
    val array2 = intArrayOf(5, -2, 7, -1, 0, 3, -4)
    val processedArray = processArray(array2)
    println("Обработанный массив: ${processedArray.joinToString(", ")}")
    println("Задание 3")
    val matrix = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )
    val k = 2
    printKthRow(matrix, k)

}