import assertk.all
import assertk.assertThat
import assertk.assertions.any
import assertk.assertions.isEqualTo
import assertk.assertions.prop
import org.junit.jupiter.api.Test

class AssertkTest {

    @Test
    fun `should not pass`() {
        val key1 = "key1"
        val value1 = "value1"

        val key2 = "key2"
        val value2 = "value2"

        val map: Map<String, Collection<Any>> = mapOf(key1 to listOf(value1), key2 to setOf(value2))

        assertThat(map.entries).all {
            any {
                it.all {
                    prop(Map.Entry<String, Any>::key).isEqualTo(key1) // assert 1
                    prop(Map.Entry<Any, Collection<Any>>::key).isEqualTo(value1) // assert 2
                }
            }
        }
    }

}