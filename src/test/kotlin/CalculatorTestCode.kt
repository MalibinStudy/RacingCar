import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class CalculatorTestCode {
    @Test
    fun addTest() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.add(10, 3)
        assertThat(result).isEqualTo(13)
    }

    @Test
    fun subtractTest() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.subtract(7, 2)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun multiplyTest() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.multiply(2, 8)
        assertThat(result).isEqualTo(16)
    }

    @Test
    fun divideTest() {
        val stringCalculator = StringCalculator()
        val result = stringCalculator.divide(20, 4)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun calculateTest() {
        val listString = listOf("4", "+", "2", "/", "3")
        val stringCalculator = StringCalculator()
        assertThat(stringCalculator.calculate(listString)).isEqualTo(2)
    }

    @Test
    fun checkOperator() {
        val splitString = listOf("4", "*", "2")
        InspectInput.checkOperator(splitString)
    }

    @Test
    fun checkBlank() {
        val calculateString = " "
        assertThatThrownBy { InspectInput.checkBlank(calculateString) }
    }

    @Test
    fun splitEquationTest() {
        val listString = listOf("1", "+", "3")
        assertThat(listString).isEqualTo(InspectInput.splitEquation("1 + 3"))
    }
}
