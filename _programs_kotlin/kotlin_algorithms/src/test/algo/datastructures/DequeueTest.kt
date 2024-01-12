

package algo.datastructures

import org.junit.Assert
import org.junit.Test
import java.util.*

class DequeueTest {
    @Test
    fun emptyTest() {
        val dequeue = Dequeue<Int>()
        Assert.assertEquals(0, dequeue.size)
        Assert.assertTrue(dequeue.isEmpty())
    }

    @Test(expected= NoSuchElementException::class)
    fun exceptionTest() {
        val dequeue = Dequeue<Int>()
        dequeue.peekFirst()
    }

    @Test
    fun naiveTest() {
        val dequeue = Dequeue<Int>()
        for (i in 0..10) {
            dequeue.add(i)
        }
        for (i in 0..5) {
            Assert.assertEquals(i, dequeue.peekFirst())
            Assert.assertEquals(i, dequeue.pollFirst())
        }
        for (i in 10..6) {
            Assert.assertEquals(i, dequeue.peekLast())
            Assert.assertEquals(i, dequeue.pollLast())
        }
    }

    @Test
    fun naiveIteratorTest() {
        val dequeue = Dequeue<Int>()
        for (i in 0..10) {
            dequeue.add(i)
        }

        var k = 0
        for (i in dequeue) {
            Assert.assertEquals(i, k++)
        }
    }

    @Test
    fun naiveContainsTest() {
        val dequeue = Dequeue<Int>()
        for (i in 0..10) {
            dequeue.add(i)
        }

        for (i in 0..10) {
            Assert.assertTrue(dequeue.contains(i))
        }

        Assert.assertFalse(dequeue.contains(100))
        Assert.assertFalse(dequeue.contains(101))
        Assert.assertFalse(dequeue.contains(103))
    }
}
