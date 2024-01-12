

package algo.datastructures

import org.junit.Assert
import org.junit.Test
import java.util.NoSuchElementException

class IndexedPriorityQueueTest {
    @Test
    fun emptyTest() {
        val pq = IndexedPriorityQueue<Int>(3)
        Assert.assertEquals(0, pq.size)
        Assert.assertTrue(pq.isEmpty())
    }

    @Test(expected= NoSuchElementException::class)
    fun exceptionTest() {
        val pq = IndexedPriorityQueue<Int>(3)
        pq.peek()
    }

    @Test
    fun naiveTest() {
        val pq = IndexedPriorityQueue<Int>(20)
        for (i in 10 downTo 1) {
            pq.insert(20 - i, i)
            Assert.assertEquals(Pair(20 - i, i), pq.peek())
        }
        for (i in 1..10) {
            Assert.assertEquals(Pair(20 - i, i), pq.poll())
        }
    }
}
