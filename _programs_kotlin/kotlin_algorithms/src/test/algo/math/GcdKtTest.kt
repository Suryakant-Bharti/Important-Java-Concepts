

package algo.math

import org.junit.Test

import org.junit.Assert.*

class GcdKtTest {
    @Test
    fun gcd() {
        assertEquals(1, gcd(1, 1))
        assertEquals(8, gcd(24, 16))
        assertEquals(8, gcd(16, 24))
        assertEquals(16, gcd(16, 16))
        assertEquals(1, gcd(13, 29))
        assertEquals(8, gcd(40, 16))
        assertEquals(5, gcd(40, 15))
    }

    @Test
    fun lcm() {
        assertEquals(1, lcm(1, 1))
        assertEquals(48, lcm(24, 16))
        assertEquals(48, lcm(16, 24))
        assertEquals(16, lcm(16, 16))
        assertEquals(377, lcm(13, 29))
        assertEquals(80, lcm(40, 16))
        assertEquals(120, lcm(40, 15))
        assertEquals(1000000, lcm(1000000, 1000000))
    }
}
