package abstractClasses

/**
 * 1. Написать абстрактный класс Shop(магазин). Написать несколько свойств класса, две абстрактные функции и одну обычную,
 * характеризующих работу магазина. Создать два класса наследника магазин Magnit и Pyaterochka. Написать реализацию функций.
 * 2. Написать абстрактный класс Person. В конструкторе передать несколько свойств, например, имени, фамилии, возраста.
 * Написать абстрактные функции, характеризующие деятельность объекта класса и одну или несколько обычных.
 * Создать два класса наследника Student и Employee. Написать реализацию функций.
 * 3. Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
 * Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число).
 * Rfr Найти длину отрезка в тех величинах, под номером которых они находятся.
 */

abstract class Shop(val name: String, val location: String) {

    val openingHours: String = "08:00 - 22:00"
    val closingDay: String = "Sunday"

    abstract fun sellProduct(product: String)
    abstract fun stockProduct(product: String, quantity: Int)

    fun showInfo() {
        println("Магазин: $name, Расположение: $location, Часы работы: $openingHours, Выходной: $closingDay")
    }
}

class Magnit(name: String, location: String) : Shop(name, location) {

    override fun sellProduct(product: String) {
        println("Магнит продает $product")
    }

    override fun stockProduct(product: String, quantity: Int) {
        println("Магнит пополнил запасы $product на количество $quantity")
    }
}

class Pyaterochka(name: String, location: String) : Shop(name, location) {

    override fun sellProduct(product: String) {
        println("Пятерочка продает $product")
    }

    override fun stockProduct(product: String, quantity: Int) {
        println("Пятерочка пополнила запасы $product на количество $quantity")
    }
}
abstract class Person(val firstName: String, val lastName: String, val age: Int) {

    abstract fun activity()

    fun introduce() {
        println("Привет, меня зовут $firstName $lastName, мне $age лет.")
    }
}

class Student(firstName: String, lastName: String, age: Int, val grade: String) : Person(firstName, lastName, age) {

    override fun activity() {
        println("$firstName $lastName занимается учебой в классе $grade.")
    }

    fun study() {
        println("$firstName $lastName учится и получает новые знания.")
    }
}

class Employee(firstName: String, lastName: String, age: Int, val position: String) : Person(firstName, lastName, age) {

    override fun activity() {
        println("$firstName $lastName работает на должности $position.")
    }

    fun work() {
        println("$firstName $lastName обучает студентов.")
    }
}

fun convertLength(unitNumber: Int, lengthInMeters: Double): Pair<Double, String> {
    var text =" "
    var lenghts:Double = 0.0
     when (unitNumber)  {
        1 -> {lenghts = lengthInMeters * 10
             text = "дециметров"}
        2 -> {lenghts =lengthInMeters / 1000
            text = "километров"}
        3 -> {lenghts =lengthInMeters
            text = "метров"}
        4 -> {lenghts =lengthInMeters * 1000
            text = "миллиметров"}
        5 -> {lenghts =lengthInMeters * 100
            text = "сантиметров"}
        else -> {
            throw IllegalArgumentException("Некорректный номер единицы длины")
        }
     }
    return Pair (lenghts,text)
}

fun main() {
    println("Задание 1")
    val magnit = Magnit("Магнит", "Москва")
    val pyaterochka = Pyaterochka("Пятерочка", "Питер")
    magnit.showInfo()
    magnit.sellProduct("Хлеб")
    magnit.stockProduct("Молоко", 100)
    pyaterochka.showInfo()
    pyaterochka.sellProduct("Фрукты")
    pyaterochka.stockProduct("Овощи", 200)
    println("Задание 2")
    val student = Student("Иван", "Иванов", 20, "3 курс")
    val employee = Employee("Мария", "Петрова", 30, "преподаватель")
    student.introduce()
    student.activity()
    student.study()
    employee.introduce()
    employee.activity()
    employee.work()
    println("Задание 3")
    var unitNumber = 3
    var lengthInMeters = 1.23
    var convertedLength = convertLength(unitNumber, lengthInMeters)
    println("Длина отрезка: $convertedLength ")
    unitNumber = 4
    //lengthInMeters = 2.23
    convertedLength = convertLength(unitNumber, lengthInMeters)
    println("Длина отрезка: $convertedLength ")

}
