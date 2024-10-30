package gettersSetters

/**
 * 1. Написать класс «Банковская карта». В нем создать свойства номера карты и код карты.
 * В главной функции мы можем получить доступ к номеру карты, но не можем к коду. Есть функция, которая описывает,
 * что данные карты будут доступны после ввода пароля.
 * 2. Дана переменная a – целое число. Используя составные операторы присваивания необходимо выполнить операции:
 * a увеличить на 7, полученное число уменьшить на 4, далее полученный результат умножить на 2 и найти остаток от деления разделив на 3.
 * 3. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа. 753 -> 357.
 */
class BankCard(private val cardNumber: String, private var cardCode: String) {

    fun getCardNumber(): String {
        return cardNumber
    }

    fun accessCardCode(password: String): String {
        return if (password == "correctPassword") {
            "Данные карты: Номер карты - $cardNumber, Код карты - $cardCode"
        } else {
            "Неправильный пароль. Доступ запрещен."
        }
    }
}

fun reverseDigits(number: Int): Int {
    var num = number
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    return reversed
}



    fun main() {
    println("Задание 1")
    val myCard = BankCard("1234-5678-9999-9999", "1234")
    println("Номер карты: ${myCard.getCardNumber()}")
    println(myCard.accessCardCode("wrongPassword"))
    println(myCard.accessCardCode("correctPassword"))
    println("Задание 2")
    var a = 5
    a += 7
    a -= 4
    a *= 2
    val result = a % 3
    println("Результат: $result")
    println("Задание 3")
    val number = 753
    val reversed = reverseDigits(number)
    println("Число после перестановки цифр: $reversed")
}