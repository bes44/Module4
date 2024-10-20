package ClassMembers
/**
1. Создать класс вертолет со свойствами название(имя), взлетный вес, скорость полета, максимальная высота полета.
  В классе с методом main создать экземпляр этого класса, например, alligator, свойствам задать конкретные значения.
  Вывести в консоль строку: «Спроектировали вертолет с названием… скоростью полета… весом… высотой полета…»
2. Написать класс домашнее животное. Свойствами класса будут вес, кличка и принадлежность к определённому типу
  (коровы, гуси, собаки и так далее), нужно их написать в классе. В классе с главным методом создайте свое домашнее животное.
  Выведите в консоль:
println("Домашнее животное: " + … +
       "Кличка: " + …. +
       "Вес: " + …);
3. Даны переменная с плавающей точкой, равная 5,87. Необходимо привести ее к целочисленному типу.
*/
class Helicopter(
    val name: String,
    val takeoffWeight: Int,
    val flightSpeed: Int,
    val maxFlightAltitude: Int
) {
    fun getInfo(): String {
        return "Спроектировали вертолет с названием $name, скоростью полета $flightSpeed км/ч, весом $takeoffWeight кг, высотой полета $maxFlightAltitude м."
    }
}

class Pet(
    val type: String,
    val name: String,
    val weight: Double
) {
    fun getInfo(): String {
        return "Домашнее животное: $type\nКличка: $name\nВес: $weight кг"
    }
}

    fun main() {
      println("Задание 1")
        val alligator = Helicopter("Alligator", 10000, 300, 5000)
        println(alligator.getInfo())
      println("Задание 2")
        val myPet = Pet("Кошка", "Афина", 10.5)
        val sistersPet = Pet("Собака", "Лайма", 20.0)
        println(myPet.getInfo())
        println(sistersPet.getInfo())
      println("Задание 3")
        val floatNumber = 5.87
        val intNumber = floatNumber.toInt()
        println("Целочисленное значение: $intNumber")
    }
