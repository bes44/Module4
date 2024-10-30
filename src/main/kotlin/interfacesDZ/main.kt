package interfacesDZ

/**
 * 1. Написать абстрактный класс «Службы экстренного реагирования». У него есть свой конструктор, содержащий свойства name и phone.
 * Он содержит функцию, характеризующий его деятельность. Напишите интерфейс, который содержит функцию getDescription, дающую описание той или ной службы или организации.
 * 2. Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД), используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
 * 3. Дан набор целых чисел. Найти второе максимальное число.
 */
abstract class EmergencyService(val name: String, val phone: String) {

    abstract fun performDuty()
}

interface Describable {
    fun getDescription(): String
}

class FireDepartment(name: String, phone: String) : EmergencyService(name, phone), Describable {

    override fun performDuty() {
        println("Пожарная служба тушит пожары и спасает людей.")
    }

    override fun getDescription(): String {
        return "Пожарная служба $name, телефон: $phone"
    }
}

class MedicalService(name: String, phone: String) : EmergencyService(name, phone), Describable {

    override fun performDuty() {
        println("Медицинская служба оказывает первую медицинскую помощь.")
    }

    override fun getDescription(): String {
        return "Медицинская служба $name, телефон: $phone"
    }
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        gcd(b, a % b)
    }
}

fun findSecondMax(numbers: List<Int>): Int? {
    if (numbers.size < 2) return null

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (number in numbers) {
        if (number > max) {
            secondMax = max
            max = number
        } else if (number > secondMax && number != max) {
            secondMax = number
        }
    }

    return if (secondMax == Int.MIN_VALUE) null else secondMax
}

fun main() {
    println("Задание 1")
    val fireDept = FireDepartment("Пожарная часть Ленинского района", "123-456")
    val medicalService = MedicalService("Подстанция №2", "987-654")

    fireDept.performDuty()
    println(fireDept.getDescription())

    medicalService.performDuty()
    println(medicalService.getDescription())
    println("Задание 2")
    val a = 56
    val b = 98
    println("НОД($a, $b) = ${gcd(a, b)}")
    println("Задание 3")
    val numbers = listOf(3, 67, 1, 55, 65, 89, 23)
    val secondMax = findSecondMax(numbers)
    println("В списке $numbers")
    println("Второе максимальное число: $secondMax")

}
