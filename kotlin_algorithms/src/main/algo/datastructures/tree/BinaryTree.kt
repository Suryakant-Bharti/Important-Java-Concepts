

package algo.datastructures.tree

import algo.datastructures.Queue

class BinaryTree(var value: Int, var left: BinaryTree?, var right: BinaryTree?) {
    constructor(value: Int): this(value, null, null)

    fun size(): Int {
        var size = 1
        if (left != null) {
            size += left!!.size()
        }
        if (right != null) {
            size += right!!.size()
        }
        return size
    }

    fun height(): Int {
        val left = if (left == null) 0 else left!!.height()
        val right = if (right == null) 0 else right!!.height()
        return maxOf(left, right) + 1
    }

    fun add(value: Int) {
        // adds the on the first empty level
        val queue = Queue<BinaryTree>()
        queue.add(this)
        while (!queue.isEmpty()) {
            val x = queue.poll()
            if (x.left == null) {
                x.left = BinaryTree(value)
                return
            } else if (x.right == null) {
                x.right = BinaryTree(value)
                return
            } else {
                queue.add(x.left!!)
                queue.add(x.right!!)
            }
        }
    }
}
