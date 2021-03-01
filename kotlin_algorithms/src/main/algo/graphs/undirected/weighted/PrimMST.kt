

package algo.graphs.undirected.weighted

import algo.datastructures.IndexedPriorityQueue
import algo.datastructures.Queue

class PrimMST(G: UWGraph): MST {
    var weight: Double = 0.0
    var edges: Queue<UWGraph.Edge> = Queue()

    /**
     * distTo[v] = distance  of shortest s->v path
     */
    private val distTo: DoubleArray = DoubleArray(G.V) { Double.POSITIVE_INFINITY }

    /**
     * edgeTo[v] = last edge on shortest s->v path
     */
    private val edgeTo: Array<UWGraph.Edge?> = arrayOfNulls(G.V)

    /**
     * priority queue of vertices
     */
    private val pq: IndexedPriorityQueue<Double> = IndexedPriorityQueue(G.V)

    private val visited = Array(G.V) { false }

    init {
        for (s in G.vertices()) {
            if (!visited[s]) {
                distTo[s] = 0.0
                pq.insert(s, 0.0)
                while (!pq.isEmpty()) {
                    val v = pq.poll().first
                    visited[v] = true
                    for (e in G.adjacentEdges(v)) {
                        scan(e, v)
                    }
                }
            }
        }

        for (v in edgeTo.indices) {
            val e = edgeTo[v]
            if (e != null) {
                edges.add(e)
                weight += e.weight
            }
        }
    }

    private fun scan(e: UWGraph.Edge, v: Int) {
        val w = e.other(v)
        if (!visited[w]) { // v-w is obsolete edge
            if (e.weight < distTo[w]) {
                distTo[w] = e.weight
                edgeTo[w] = e
                if (pq.contains(w)) {
                    pq.decreaseKey(w, distTo[w])
                } else {
                    pq.insert(w, distTo[w])
                }
            }
        }
    }

    override fun edges(): Iterable<UWGraph.Edge> {
        return edges
    }

    override fun weight(): Double {
        return weight
    }
}