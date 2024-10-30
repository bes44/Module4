package ClassConstructors

/**
 *
1. Создать класс Box(коробка), у которого есть свойства width, height, depth. Написать функцию вычисления объёма коробки в классе Box.
В классе с функцией main создать экземпляр класса Box, в конструктор класса передать свойства, задать им значения, вызвать функцию вычисления объема и вывести его на экран.
2. Дан набор из N чисел. Найти минимальный и максимальный из элементов данного набора и вывести их.
3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран элементы массива.
4. Дано целое число. Вывести его строку-описание вида «отрицательное четное число», «отрицательное нечетное число» «нулевое число»,
«положительное нечетное число», «положительное четное число». int a = 34 à «положительное четное число»
5. Создайте класс Car. В классе есть конструктор с параметрами массы, скорости. В классе с функцией main создайте экземпляр этого класса
и задайте там параметры в конструктор. Напишите функции движения и остановки автомобиля.
 */
class Box(val width: Double, val height: Double, val depth: Double) {
    fun calculateVolume(): Double {
        return width * height * depth
    }
}
fun findMinMax(numbers: List<Int>): Pair<Int, Int> {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("Набор чисел пуст.")
    }
    val min = numbers.minOrNull() ?: throw IllegalArgumentException("Ошибка при нахождении минимума.")
    val max = numbers.maxOrNull() ?: throw IllegalArgumentException("Ошибка при нахождении максимума.")
    return Pair(min, max)
}
fun describeNumber(a: Int): String {
    return when {
        a == 0 -> "нулевое число"
        a > 0 && a % 2 == 0 -> "положительное четное число"
        a > 0 && a % 2 != 0 -> "положительное нечетное число"
        a < 0 && a % 2 == 0 -> "отрицательное четное число"
        a < 0 && a % 2 != 0 -> "отрицательное нечетное число"
        else -> "неопределенное число"
    }
}

class Car(val mass: Double, var speed: Double) {

    fun start() {
        println("Автомобиль движется со скоростью $speed км/ч")
    }

    fun stop() {
        speed = 0.0
        println("Автомобиль остановлен")
    }
}

fun main() {
    println("Задание 1")
        val box = Box(2.5, 4.0, 3.0)
        val volume = box.calculateVolume()
        println("Объём коробки: $volume кубических единиц")
    println("Задание 2")
        val numbers = listOf(5, 3, 8, 1, 9, -2, 7)
        val (min, max) = findMinMax(numbers)
        println("Минимальное значение: $min")
        println("Максимальное значение: $max")
    println("Задание 3")
        val array = intArrayOf(3, 67, 1, 55, 65, 89, 23)
        array.forEach { println(it)}
    println("Задание 4")
        val a = -34
        println(describeNumber(a))
    println("Задание 5")
        val myCar = Car(1500.0, 140.0)
        myCar.start()
        myCar.stop()
    }