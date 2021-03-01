

package algo.graphs.undirected.weighted

import algo.datastructures.Queue
import algo.graphs.Graph

class UWGraph(public override val V: Int): Graph {
    public override var E: Int = 0
    private val adj: Array<Queue<Edge>> = Array(V) { Queue<Edge>() }

    public class Edge(public val v: Int, public val w: Int, public val weight: Double): Comparable<Edge> {
        override fun compareTo(other: Edge): Int {
            return this.weight.compareTo(other.weight)
        }

        fun other(s: Int): Int {
            if (s == v) return w
            if (s == w) return v
            throw IllegalArgumentException()
        }
    }

    public fun addEdge(v: Int, w: Int, weight: Double) {
        val edge = Edge(v, w, weight)
        adj[v].add(edge)
        adj[w].add(edge)
        E++
    }

    public fun adjacentEdges(v: Int): Collection<Edge> {
        return adj[v]
    }

    public override fun adjacentVertices(v: Int): Collection<Int> {
        return adjacentEdges(v).map { it.other(v) }
    }

    public fun degree(v: Int): Int {
        return adj[v].size
    }

    public fun edges(): Collection<Edge> {
        return adj.flatMap { it }
    }
}
