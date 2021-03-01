

package algo.datastructures.tree

class Tree(var value: Int) {
    val children: MutableList<Tree> = mutableListOf()

    fun size(): Int {
        return children.fold(1, { size, child -> size + child.size() })
    }

    fun height(): Int {
        return 1 + (children.map { it.size() }.max() ?: 0)
    }

    fun add(value: Int) {
        children.add(Tree(value))
    }
}
