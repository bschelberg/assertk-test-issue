import assertk.all
import assertk.assertThat
import assertk.assertions.any
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class AssertkTest {

    @Test
    fun `should not pass, pairs`() {
        val key1 = "key 1"
        val value1 = "value 1"

        val pairs = listOf("key 2" to "value 2", "key 2" to "value 2", "key 2" to "value 2", key1 to value1)

        assertThat(pairs).any {
            it.all {
                transform { it.first }.isEqualTo(key1)
                transform { it.second }.isEqualTo("unexpected")
            }
        }
    }

}