

package algo.datastructures

import org.junit.Assert
import org.junit.Test
import java.util.NoSuchElementException

class PriorityQueueTest {
    @Test
    fun emptyTest() {
        val pq = PriorityQueue<Int>(3)
        Assert.assertEquals(0, pq.size)
        Assert.assertTrue(pq.isEmpty())
    }

    @Test(expected= NoSuchElementException::class)
    fun exceptionTest() {
        val pq = PriorityQueue<Int>(3)
        pq.peek()
    }

    @Test
    fun naiveTest() {
        val pq = PriorityQueue<Int>(3)
        for (i in 10 downTo 1) {
            pq.add(i)
            Assert.assertEquals(i, pq.peek())
        }
        for (i in 1..10) {
            Assert.assertEquals(i, pq.poll())
        }
    }
}
