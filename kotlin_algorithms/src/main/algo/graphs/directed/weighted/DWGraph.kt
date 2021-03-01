

package algo.graphs.directed.weighted

import algo.datastructures.Queue
import algo.datastructures.Stack
import algo.graphs.Graph

class DWGraph(public override val V: Int): Graph {
    public override var E: Int = 0
    private val adj: Array<Queue<Edge>> = Array(V) { Queue<Edge>() }
    private val indegree: IntArray = IntArray(V)

    public class Edge(public val from: Int, public val to: Int, public val weight: Double)

    public fun addEdge(from: Int, to: Int, weight: Double) {
        val edge = Edge(from, to, weight)
        adj[from].add(edge)
        indegree[to]++
        E++
    }

    public fun edges(): Collection<Edge> {
        val stack = Stack<Edge>()
        adj.flatMap { it }.forEach { stack.push(it) }
        return stack
    }

    public fun adjacentEdges(from: Int): Collection<Edge> {
        return adj[from]
    }

    public override fun adjacentVertices(from: Int): Collection<Int> {
        return adjacentEdges(from).map { it.to }
    }

    public fun outdegree(v: Int): Int {
        return adj[v].size
    }
}
