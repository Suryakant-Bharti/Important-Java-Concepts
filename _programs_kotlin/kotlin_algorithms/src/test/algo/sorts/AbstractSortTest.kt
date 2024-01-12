

package algo.sorts

import org.junit.Assert
import org.junit.Test

abstract class AbstractSortTest<out T: AbstractSortStrategy>(val strategy: T) {
    @Test
    fun emptyTest() {
        val arr = arrayOf<Int>()
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf<Int>(), arr)
    }

    @Test
    fun singletonTest() {
        val arr = arrayOf(1)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(1), arr)
    }

    @Test
    fun twoElementsInOrderTest() {
        val arr = arrayOf(42, 43)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(42, 43), arr)
    }

    @Test
    fun twoElementsOutOfOrderTest() {
        val arr = arrayOf(43, 42)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(42, 43), arr)
    }

    @Test
    fun twoElementsEqualTest() {
        val arr = arrayOf(42, 42)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(42, 42), arr)
    }

    @Test
    fun tenElementsReverseTest() {
        val arr = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), arr)
    }

    @Test
    fun tenElementsTest() {
        val arr = arrayOf(3, 2, 7, 6, 1, 8, 10, 9, 4, 5)
        strategy.perform(arr)
        Assert.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), arr)
    }
}
