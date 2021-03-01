

package algo.math

import org.junit.Test

import org.junit.Assert.*

class NewtonMethodKtTest {
    @Test
    fun sqrt() {
        assertTrue(sqrt(-2.0).isNaN())
        assertTrue(sqrt(-2.0, 0.toDouble()).isNaN())
        assertEquals(2.toDouble(), sqrt(4.toDouble()), 1e-15)
        assertEquals(4.toDouble(), sqrt(16.toDouble()), 1e-12)
        for (i in 7 until 99) {
            for (j in -15 until -1) {
                assertEquals(sqrt(i.toDouble()), sqrt(i.toDouble()), j.toDouble())
            }
        }
    }

    @Test
    fun sqrt1() {
        assertTrue(sqrt(-2).isNaN())
        assertEquals(2.toDouble(), sqrt(4), 1e-15)
        assertEquals(4.toDouble(), sqrt(16), 1e-12)
        for (i in 7 until 99) {
            for (j in -15 until -1) {
                assertEquals(sqrt(i), sqrt(i), j.toDouble())
            }
        }
    }
}
