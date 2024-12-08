class ArmstrongNumber(private val number: Int) {

    // Метод для формирования строки с информацией об объекте
    fun getInfo(): String {
        return "Число: $number"
    }

    // Метод для проверки, является ли число числом Армстронга
    fun isArmstrong(): Boolean {
        val digits = number.toString().map { it.digitToInt() }
        val p = digits.size
        val sumOfPowers = digits.sumOf { it.toDouble().pow(p.toDouble()).toInt() }
        return sumOfPowers == number
    }
}