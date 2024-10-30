package Redefending

/**
 * 1. Создать класс Bird(птица). Определить у него несколько свойств, например, тип(пеликанообразные, фламингообразные и тд).
 * Создать в классе свойство, которое будет характеризовать по какому-то явному признаку, например, есть птицы,
 * которые не могут подниматься в воздух или по –другому признаку. Определить функциональность класса птица.
 * Создать несколько классов наследников, которые могут переопределять свойства и функции класса – родителя.
 * 2. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 * 3. Дана строка «ПриВет, кАк деЛа». Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество.
 */
open class Bird(val type: String, val canFly: Boolean) {
    open fun describe(): String {
        return if (canFly) {
            "Птица типа $type может летать."
        } else {
            "Птица типа $type не может летать."
        }
    }
}

class Penguin : Bird("Пингвинообразные", false) {
    override fun describe(): String {
        return "Пингвин не может летать, но отлично плавает."
    }
}

class Flamingo : Bird("Фламингообразные", true) {
    override fun describe(): String {
        return "Фламинго может летать и отличается ярким розовым оперением."
    }
}

fun findLongestWord(words: Array<String>): Pair<String, Int> {
    var longestWord = ""
    var maxLength = 0

    for (word in words) {
        if (word.length > maxLength) {
            longestWord = word
            maxLength = word.length
        }
    }

    return Pair(longestWord, maxLength)
}

fun findUpperCaseLetters(input: String): Pair<List<Char>, Int> {
    val upperCaseLetters = input.filter { it.isUpperCase() }
    return Pair(upperCaseLetters.toList(), upperCaseLetters.length)
}

fun main() {
    println("Задание 1")
    val penguin = Penguin()
    val flamingo = Flamingo()
    println(penguin.describe())
    println(flamingo.describe())
    println("Задание 2")
    val words = arrayOf("сом", "престидижитация", "стратосфера", "оленевод", "картоплянник","кисло"+"родий")
    val (longestWord, length) = findLongestWord(words)
    println("Самое длинное слово: $longestWord")
    println("Количество букв в этом слове: $length")
    println("Задание 3")
    val input = "ПриВет, кАк деЛа"
    val (letters, count) = findUpperCaseLetters(input)
    println("Символы в верхнем регистре: $letters")
    println("Количество символов в верхнем регистре: $count")
}
