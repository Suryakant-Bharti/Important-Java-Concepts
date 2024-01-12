

package algo.graphs

import algo.datastructures.Stack

class DFS {
    companion object Implementations {
        fun iterative(graph: Graph,
                      preorder: ((Int) -> Unit)? = null,
                      postorder: ((Int) -> Unit)? = null) {
            val visited = IntArray(graph.V)
            val queue = Stack<Int>()
            for (i in 0 until graph.V) {
                if (visited[i] == 0) {
                    queue.push(i)
                    visited[i] = 1
                    while (!queue.isEmpty()) {
                        val v = queue.poll()
                        if (visited[v] == 1) {
                            visited[i] = 2
                            preorder?.invoke(i)
                            queue.push(v)
                            for (w in graph.adjacentVertices(v)) {
                                if (visited[w] == 0) {
                                    queue.push(w)
                                    visited[w] = 1
                                }
                            }
                        } else {
                            visited[i] = 3
                            postorder?.invoke(i)
                        }
                    }
                }
            }
        }

        fun recursive(graph: Graph,
                      preorder: ((Int) -> Unit)? = null,
                      postorder: ((Int) -> Unit)? = null) {
            val visited = BooleanArray(graph.V)
            for (i in 0..graph.V - 1) {
                if (!visited[i]) {
                    dfs(i, graph, visited, preorder, postorder)
                }
            }
        }

        private fun dfs(v: Int, graph: Graph, visited: BooleanArray,
                        preorder: ((Int) -> Unit)? = null,
                        postorder: ((Int) -> Unit)? = null) {
            visited[v] = true
            preorder?.invoke(v)
            for (w in graph.adjacentVertices(v)) {
                if (!visited[w]) {
                    dfs(w, graph, visited, preorder, postorder)
                }
            }
            postorder?.invoke(v)
        }
    }
}