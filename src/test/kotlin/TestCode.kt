import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

class TestCode {
    @Test
    fun simpleTest() {
        assertThat(3 + 5).isEqualTo(8)
    }

    // TestCode가 TDD는 아니다. (TDD는 개발 방법론 중 하나.)
    @Test
    fun personTest() {
        val person1 = Person("윤혁", 26)
        person1.changeNameTo("Malibin")
        assertThat(person1.name).isEqualTo("Malibin")
    }

    @Test
    fun personSumTest() {
        val person = Person(" ", 33434)
        val list = (1..10).toList()
        val sum = person.sumList(list)

        assertThat(sum).isEqualTo(55)
    }
}
