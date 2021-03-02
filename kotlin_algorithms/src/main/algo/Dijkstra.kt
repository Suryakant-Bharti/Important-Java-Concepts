

package algo.graphs.directed.weighted

import algo.datastructures.IndexedPriorityQueue
import algo.datastructures.Stack
import algo.graphs.NoSuchPathException

class Dijkstra(graph: DWGraph, val from: Int) {
    /**
     * distTo[v] = distance  of shortest s->v path
     */
    private val distTo: DoubleArray = DoubleArray(graph.V, { if (it == from) 0.0 else Double.POSITIVE_INFINITY })

    /**
     * edgeTo[v] = last edge on shortest s->v path
     */
    private val edgeTo: Array<DWGraph.Edge?> = arrayOfNulls(graph.V)

    /**
     * priority queue of vertices
     */
    private val pq: IndexedPriorityQueue<Double> = IndexedPriorityQueue(graph.V)

    init {
        if (graph.edges().any { it.weight < 0 }) {
            throw IllegalArgumentException("there is a negative weight edge")
        }

        // relax vertices in order of distance from s
        pq.insert(from, distTo[from])
        while (!pq.isEmpty()) {
            val v = pq.poll().first
            for (e in graph.adjacentEdges(v)) {
                relax(e)
            }
        }
    }

    // relax edge e and update pq if changed
    private fun relax(e: DWGraph.Edge) {
        val v = e.from
        val w = e.to
        if (distTo[w] > distTo[v] + e.weight) {
            distTo[w] = distTo[v] + e.weight
            edgeTo[w] = e
            if (pq.contains(w)) {
                pq.decreaseKey(w, distTo[w])
            } else {
                pq.insert(w, distTo[w])
            }
        }
    }

    /**
     * Returns the length of a shortest path from the source vertex `s` to vertex `v`.
     * @param  v the destination vertex
     * @return the length of a shortest path from the source vertex `s` to vertex `v`;
     *         `Double.POSITIVE_INFINITY` if no such path
     */
    fun distTo(v: Int): Double {
        return distTo[v]
    }

    /**
     * Returns true if there is a path from the source vertex `s` to vertex `v`.
     * @param  v the destination vertex
     * @return `true` if there is a path from the source vertex
     *         `s` to vertex `v`; `false` otherwise
     */
    fun hasPathTo(v: Int): Boolean {
        return distTo[v] < java.lang.Double.POSITIVE_INFINITY
    }

    /**
     * Returns a shortest path from the source vertex `s` to vertex `v`.
     * @param  v the destination vertex
     * @return a shortest path from the source vertex `s` to vertex `v`
     *         as an iterable of edges, and `null` if no such path
     */
    fun pathTo(v: Int): Iterable<DWGraph.Edge> {
        if (!hasPathTo(v)) throw NoSuchPathException("There is no path from [$from] to [$v]")
        val path = Stack<DWGraph.Edge>()
        var e = edgeTo[v]
        while (e != null) {
            path.push(e)
            e = edgeTo[e.from]
        }
        return path
    }
}
