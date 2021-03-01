

package algo.graphs

import algo.datastructures.Queue

class BFS {
    companion object Implementations {
        fun iterative(graph: Graph, levelOrder: ((Int) -> Unit)? = null) {
            val visited = BooleanArray(graph.V)
            val queue = Queue<Int>()
            for (i in 0 until graph.V) {
                if (!visited[i]) {
                    queue.add(i)
                    visited[i] = true
                    levelOrder?.invoke(i)
                    while (!queue.isEmpty()) {
                        val v = queue.poll()
                        for (w in graph.adjacentVertices(v)) {
                            if (!visited[w]) {
                                queue.add(w)
                                visited[w] = true
                                levelOrder?.invoke(i)
                            }
                        }
                    }
                }
            }
        }
    }
}
