

package algo.datastructures

import org.junit.Assert
import org.junit.Test

class ImmutableSetTest {
    @Test
    fun test1() {
        Assert.assertFalse(immutableSetOf(3).contains(1))
        Assert.assertFalse(immutableSetOf(3).contains(2))
        Assert.assertFalse(immutableSetOf(3).contains(4))
        Assert.assertFalse(immutableSetOf(3).contains(5))
        Assert.assertTrue(immutableSetOf(3).contains(3))
    }

    @Test
    fun test2() {
        val set = immutableSetOf(*(10 downTo 1).toList().toTypedArray())
        for (v in set) {
            Assert.assertTrue(set.contains(v))
        }
        Assert.assertEquals(10, set.size)
        Assert.assertFalse(set.isEmpty())
        Assert.assertFalse(set.contains(42))
        Assert.assertFalse(set.contains(-42))
    }

    @Test
    fun test3() {
        val set = immutableSetOf(*(0..100).toList().toTypedArray())
        for (v in -100..-1) {
            Assert.assertFalse(set.contains(v))
        }
        for (v in 0..100) {
            Assert.assertTrue(set.contains(v))
        }
        for (v in 101..200) {
            Assert.assertFalse(set.contains(v))
        }
    }
}
