

package algo.datastructures

import org.junit.Assert
import org.junit.Test

class DisjointSetTest {
    @Test
    fun sizeTest() {
        val set = DisjointSet(10)
        Assert.assertEquals(10, set.count)
        Assert.assertEquals(10, set.size)
        set.union(0, 1)
        Assert.assertEquals(9, set.count)
        Assert.assertEquals(10, set.size)
        set.union(0, 2)
        Assert.assertEquals(8, set.count)
        Assert.assertEquals(10, set.size)
    }

    @Test
    fun naiveTest() {
        val set = DisjointSet(10)
        for (i in 1..set.size-1) {
            Assert.assertFalse(set.connected(i, i - 1))
        }
        set.union(1, 2)
        Assert.assertTrue(set.connected(1, 2))
        set.union(1, 3)
        Assert.assertTrue(set.connected(1, 3))
        Assert.assertTrue(set.connected(2, 3))
        set.union(3, 4)
        Assert.assertTrue(set.connected(2, 4))
        Assert.assertFalse(set.connected(0, 1))
        Assert.assertFalse(set.connected(0, 5))
        Assert.assertFalse(set.connected(4, 5))
    }
}