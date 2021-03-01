

package algo.search

import org.junit.Assert
import org.junit.Test

abstract class AbstractSearchTest<out T: AbstractSearchStrategy<Int>>(val strategy: T) {
    @Test
    fun emptyTest() {
        Assert.assertEquals(-1, strategy.perform(emptyArray(), 1))
    }

    @Test
    fun singletonTest() {
        Assert.assertEquals(0, strategy.perform(arrayOf(1), 1))
        Assert.assertEquals(-1, strategy.perform(arrayOf(1), 2))
    }

    @Test
    fun twoElementsTest() {
        Assert.assertEquals(0, strategy.perform(arrayOf(1, 2), 1))
        Assert.assertEquals(1, strategy.perform(arrayOf(1, 2), 2))
        Assert.assertEquals(-1, strategy.perform(arrayOf(1, 2), 3))
    }

    @Test
    fun tenElementsTest() {
        Assert.assertEquals(0, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1))
        Assert.assertEquals(1, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2))
        Assert.assertEquals(2, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3))
        Assert.assertEquals(3, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4))
        Assert.assertEquals(4, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
        Assert.assertEquals(5, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 6))
        Assert.assertEquals(6, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 7))
        Assert.assertEquals(7, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 8))
        Assert.assertEquals(8, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 9))
        Assert.assertEquals(9, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10))
        Assert.assertEquals(-1, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0))
        Assert.assertEquals(-1, strategy.perform(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 11))
    }
}
