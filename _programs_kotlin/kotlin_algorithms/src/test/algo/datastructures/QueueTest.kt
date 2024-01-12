

package algo.datastructures

import org.junit.Assert
import org.junit.Test
import java.util.*

class QueueTest {
    @Test
    fun emptyTest() {
        val queue = Queue<Int>()
        Assert.assertEquals(0, queue.size)
        Assert.assertTrue(queue.isEmpty())
    }

    @Test(expected= NoSuchElementException::class)
    fun exceptionTest() {
        val queue = Queue<Int>()
        queue.peek()
    }

    @Test
    fun naiveTest() {
        val queue = Queue<Int>()
        for (i in 0..10) {
            queue.add(i)
        }
        for (i in 0..10) {
            Assert.assertEquals(i, queue.peek())
            Assert.assertEquals(i, queue.poll())
        }
        Assert.assertEquals(0, queue.size)
    }

    @Test
    fun naiveIteratorTest() {
        val queue = Queue<Int>()
        for (i in 0..10) {
            queue.add(i)
        }

        var k = 0
        for (i in queue) {
            Assert.assertEquals(i, k++)
        }
    }

    @Test
    fun naiveContainsTest() {
        val queue = Queue<Int>()
        for (i in 0..10) {
            queue.add(i)
        }

        for (i in 0..10) {
            Assert.assertTrue(queue.contains(i))
        }

        Assert.assertFalse(queue.contains(100))
        Assert.assertFalse(queue.contains(101))
        Assert.assertFalse(queue.contains(103))
    }
}
