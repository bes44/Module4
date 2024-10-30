package heirdom

/**
 * 1. Создать суперкласс Animal(животное) со свойствами веса и имени.
 * Написать функцию, которая описывает прием пищи животного.
 * Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса.
 * У каждого животного определить по одной своейфункции.
 * 2. Создать классы Nokia и Sony. Наследовать каждый из них от суперклассов Smartphone и IPhone.
 * Создать несколько свойств в суперклассах и функцию звонка.
 * 3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран элементы массива, которые делятся на 5 на цело.
 */
open class Animal(val name: String, val weight: Double) {
    open fun eat() {
        println("$name кушает.")
    }
}

class Dog(name: String, weight: Double) : Animal(name, weight) {
    fun bark() {
        println("$name лает.")
    }
}

class Cat(name: String, weight: Double) : Animal(name, weight) {
    fun meow() {
        println("$name мяукает.")
    }
}

open class Smartphone(val brand: String, val model: String) {
    open fun makeCall(number: String) {
        println("Звонок на номер $number с $brand $model")
    }
}

open class IPhone(val iosVersion: String) : Smartphone("Apple", "iPhone") {
    override fun makeCall(number: String) {
        println("Звонок на номер $number с iPhone с версией iOS $iosVersion")
    }
}

class Nokia(model: String, val durability: String) : Smartphone("Nokia", model) {
    fun showDurability() {
        println("Прочность модели $model: $durability")
    }
}

class Sony(model: String, val cameraQuality: String) : Smartphone("Sony", model) {
    fun showCameraQuality() {
        println("Качество камеры модели $model: $cameraQuality")
    }
}

fun main() {
    println("Задание 1")
    val dog = Dog("Шарик", 10.0)
    val cat = Cat("Мурка", 5.0)
    dog.eat()
    dog.bark()
    cat.eat()
    cat.meow()
    println("Задание 2")
    val myNokia = Nokia("3310", "Не убиваемый")
    val mySony = Sony("Xperia 10v8", "Отличное")
    val myIPhone = IPhone("15")
    myNokia.makeCall("123-456")
    myNokia.showDurability()
    mySony.makeCall("765-432")
    mySony.showCameraQuality()
    myIPhone.makeCall("098-765")
    println("Задание 3")
    val array = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    val divisibleByFive = array.filter { it % 5 == 0 }
    println("Элементы массива, которые делятся на 5 на цело: $divisibleByFive")
}
