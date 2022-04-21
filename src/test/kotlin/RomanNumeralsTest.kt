import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RomanNumeralsTest {
    @Test
    fun `9 should return IX`() {
        val romanNumerals = RomanNumerals()

        val expected = "IX"
        val result = romanNumerals.intToRoman(9)

        assertEquals(expected, result)
    }

    @Test
    fun `40 should return XL`() {
        val romanNumerals = RomanNumerals()

        val expected = "XL"
        val result = romanNumerals.intToRoman(40)

        assertEquals(expected, result)
    }

    @Test
    fun `1904 should return MCMIV`() {
        val romanNumerals = RomanNumerals()

        val expected = "MCMIV"
        val result = romanNumerals.intToRoman(1904)

        assertEquals(expected, result)
    }

    @Test
    fun `0 should throw an exception`() {
        val romanNumerals = RomanNumerals()

        assertThrows(IllegalArgumentException::class.java) { romanNumerals.intToRoman(0) }
    }

    @Test
    fun `4000 should throw an exception`() {
        val romanNumerals = RomanNumerals()

        assertThrows(IllegalArgumentException::class.java) { romanNumerals.intToRoman(4000) }
    }
}