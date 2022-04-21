class RomanNumerals {
	/**
	 * Converts decimal to roman numerals from 1 to 3999
 	 */
	fun intToRoman(n: Int): String {
		if (n < 1 || n > 3999) {
			throw IllegalArgumentException("The number must be between 1 and 3999, both inclusive.")
		}

		val m = arrayOf("", "M", "MM", "MMM")

		val c = arrayOf(
			"", "C", "CC", "CCC", "CD",
			"D", "DC", "DCC", "DCCC", "CM"
		)

		val x = arrayOf(
			"", "X", "XX", "XXX", "XL",
			"L", "LX", "LXX", "LXXX", "XC"
		)

		val i = arrayOf(
			"", "I", "II", "III", "IV",
			"V", "VI", "VII", "VIII", "IX"
		)

		val thousands = m[n / 1000]
		val hundreds = c[n % 1000 / 100]
		val tens = x[n % 100 / 10]
		val ones = i[n % 10]
		val total = thousands + hundreds + tens + ones
		return total
	}
}