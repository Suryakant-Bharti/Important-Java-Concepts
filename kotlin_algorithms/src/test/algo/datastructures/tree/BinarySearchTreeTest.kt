

package algo.datastructures.tree

import org.junit.Assert
import org.junit.Test

class BinarySearchTreeTest {
    @Test
    fun empty() {
        val tree = BinarySearchTree<Int, Int>()
        Assert.assertEquals(0, tree.size)
        Assert.assertTrue(tree.isEmpty())
    }

    @Test
    fun sizeOfOne() {
        val tree = BinarySearchTree<Int, String>()
        tree.add(1, "1")
        Assert.assertFalse(tree.isEmpty())
        Assert.assertEquals(1, tree.size)
        Assert.assertEquals(1, tree.height())
        Assert.assertEquals(1, tree.min())
        Assert.assertEquals(1, tree.max())
        Assert.assertEquals("1", tree[1])
        tree.pollMin()
        Assert.assertTrue(tree.isEmpty())
    }

    @Test
    fun sizeOfThree() {
        val tree = BinarySearchTree<Int, String>()
        tree.add(1, "1")
        tree.add(2, "2")
        tree.add(3, "3")
        Assert.assertFalse(tree.isEmpty())
        Assert.assertEquals(3, tree.size)
        Assert.assertEquals(3, tree.height())
        Assert.assertEquals(1, tree.min())
        Assert.assertEquals(3, tree.max())
        Assert.assertEquals("1", tree[1])
        Assert.assertEquals("2", tree[2])
        Assert.assertEquals("3", tree[3])
        tree.pollMin()
        Assert.assertEquals(2, tree.min())
        Assert.assertEquals(3, tree.max())
        Assert.assertEquals("2", tree[2])
        Assert.assertEquals("3", tree[3])
        tree.pollMax()
        Assert.assertEquals(2, tree.min())
        Assert.assertEquals(2, tree.max())
        Assert.assertEquals("2", tree[2])
    }

    @Test
    fun overwrite() {
        val tree = BinarySearchTree<Int, String>()
        tree.add(1, "1")
        Assert.assertFalse(tree.isEmpty())
        Assert.assertEquals(1, tree.size)
        Assert.assertEquals(1, tree.height())
        Assert.assertEquals("1", tree[1])
        tree.add(1, "2")
        Assert.assertFalse(tree.isEmpty())
        Assert.assertEquals(1, tree.size)
        Assert.assertEquals(1, tree.height())
        Assert.assertEquals(1, tree.min())
        Assert.assertEquals(1, tree.max())
        Assert.assertEquals("2", tree[1])
        tree.pollMin()
        Assert.assertTrue(tree.isEmpty())
    }

    @Test
    fun letters() {
        val tree = BinarySearchTree<Char, String>()
        val letters = arrayOf('j', 'p', 'q', 's', 'f', 'o', 'g', 'v', 'h', 'm', 'x', 'z',
                'l', 'n', 'd', 'c', 'a', 'r', 'b', 't', 'i', 'u', 'w', 'k', 'y', 'e')
        letters.forEach { tree.add(it, it.toString()) }

        Assert.assertEquals(letters.toSet(), tree.keys)
        Assert.assertArrayEquals(letters.map { it.toString() }.sorted().toTypedArray(),
                tree.values.sorted().toTypedArray())

        Assert.assertEquals(26, tree.size)
        Assert.assertEquals('a', tree.min())
        Assert.assertEquals('z', tree.max())
        tree.pollMin()
        Assert.assertEquals(25, tree.size)
        Assert.assertEquals('b', tree.min())
        Assert.assertEquals('z', tree.max())
        tree.pollMax()
        Assert.assertEquals(24, tree.size)
        Assert.assertEquals('b', tree.min())
        Assert.assertEquals('y', tree.max())
        tree.pollMin()
        Assert.assertEquals(23, tree.size)
        Assert.assertEquals('c', tree.min())
        Assert.assertEquals('y', tree.max())
        tree.pollMax()
        Assert.assertEquals(22, tree.size)
        Assert.assertEquals('c', tree.min())
        Assert.assertEquals('x', tree.max())
        tree.pollMin()
        Assert.assertEquals(21, tree.size)
        Assert.assertEquals('d', tree.min())
        Assert.assertEquals('x', tree.max())
        tree.pollMax()
        Assert.assertEquals(20, tree.size)
        Assert.assertEquals('d', tree.min())
        Assert.assertEquals('w', tree.max())
        tree.pollMin()
        tree.pollMin()
        tree.pollMin()
        Assert.assertEquals(17, tree.size)
        Assert.assertEquals('g', tree.min())
        Assert.assertEquals('w', tree.max())
        tree.pollMax()
        tree.pollMax()
        tree.pollMax()
        Assert.assertEquals(14, tree.size)
        Assert.assertEquals('g', tree.min())
        Assert.assertEquals('t', tree.max())
        tree.pollMin()
        tree.pollMin()
        tree.pollMin()
        tree.pollMin()
        tree.pollMin()
        Assert.assertEquals(9, tree.size)
        Assert.assertEquals('l', tree.min())
        Assert.assertEquals('t', tree.max())
        tree.pollMax()
        tree.pollMax()
        tree.pollMax()
        tree.pollMax()
        tree.pollMax()
        Assert.assertEquals(4, tree.size)
        Assert.assertEquals('l', tree.min())
        Assert.assertEquals('o', tree.max())
        tree.pollMin()
        Assert.assertEquals(3, tree.size)
        Assert.assertEquals('m', tree.min())
        Assert.assertEquals('o', tree.max())
        tree.pollMax()
        Assert.assertEquals(2, tree.size)
        Assert.assertEquals('m', tree.min())
        Assert.assertEquals('n', tree.max())
        tree.pollMin()
        Assert.assertEquals(1, tree.size)
        Assert.assertEquals('n', tree.min())
        Assert.assertEquals('n', tree.max())
        tree.pollMin()
        Assert.assertTrue(tree.isEmpty())
    }

    @Test
    fun remove() {
        val tree = BinarySearchTree<Int, String>()
        for (i in 0..30) {
            tree.add(i, (i * i).toString())
        }

        for (i in 0..30) {
            Assert.assertEquals((i * i).toString(), tree[i])
        }

        var counter = 0
        for ((key, value) in tree) {
            Assert.assertEquals(counter, key)
            Assert.assertEquals((counter * counter).toString(), value)
            counter++
        }

        tree.remove(15)
        tree.remove(0)
        tree.remove(30)
        Assert.assertEquals(1, tree.min())
        Assert.assertEquals(29, tree.max())
        tree.remove(14)
        tree.remove(16)
        tree.remove(1)
        tree.remove(29)
        Assert.assertEquals(2, tree.min())
        Assert.assertEquals(28, tree.max())
        tree.remove(13)
        tree.remove(17)
        tree.remove(2)
        tree.remove(28)
        Assert.assertEquals(3, tree.min())
        Assert.assertEquals(27, tree.max())
        tree.remove(12)
        tree.remove(18)
        tree.remove(3)
        tree.remove(27)
        Assert.assertEquals(4, tree.min())
        Assert.assertEquals(26, tree.max())
        tree.remove(11)
        tree.remove(19)
        tree.remove(4)
        tree.remove(26)
        Assert.assertEquals(5, tree.min())
        Assert.assertEquals(25, tree.max())
        Assert.assertEquals(12, tree.size)

        Assert.assertEquals("25", tree[5])
        Assert.assertEquals("36", tree[6])
        Assert.assertEquals("49", tree[7])
        Assert.assertEquals("64", tree[8])
        Assert.assertEquals("81", tree[9])
        Assert.assertEquals("100", tree[10])
        Assert.assertEquals("400", tree[20])
        Assert.assertEquals("441", tree[21])
        Assert.assertEquals("484", tree[22])
        Assert.assertEquals("529", tree[23])
        Assert.assertEquals("576", tree[24])
        Assert.assertEquals("625", tree[25])
    }

    @Test(expected= NoSuchElementException::class)
    fun emptyMinFails() {
        BinarySearchTree<Int, Unit>().min()
    }

    @Test(expected= NoSuchElementException::class)
    fun emptyMaxFails() {
        BinarySearchTree<Int, Unit>().max()
    }

    @Test(expected= NoSuchElementException::class)
    fun emptyPollMinFails() {
        BinarySearchTree<Int, Unit>().pollMin()
    }

    @Test(expected= NoSuchElementException::class)
    fun emptyPollMaxFails() {
        BinarySearchTree<Int, Unit>().pollMax()
    }
}
