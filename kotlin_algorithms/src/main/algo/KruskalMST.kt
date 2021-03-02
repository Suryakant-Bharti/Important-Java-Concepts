

package algo.graphs.undirected.weighted

import algo.datastructures.DisjointSet
import algo.datastructures.PriorityQueue
import algo.datastructures.Queue

/**
 * Kruskal's algorithm will grow a solution from the cheapest edge by adding the next cheapest edge,
 * provided that it doesn't create a cycle.
 */
class KruskalMST(G: UWGraph): MST {
    var weight: Double = 0.0
    var edges: Queue<UWGraph.Edge> = Queue()

    /**
     * Compute a minimum spanning tree (or forest) of an edge-weighted graph.
     * @param G the edge-weighted graph
     */
    init {
        val pq = PriorityQueue<UWGraph.Edge>(G.V, compareBy({ it.weight }))
        for (v in G.vertices()) {
            for (e in G.adjacentEdges(v)) {
                pq.add(e)
            }
        }

        val set = DisjointSet(G.V)
        while (!pq.isEmpty()) {
            val edge = pq.poll()
            if (!set.connected(edge.v, edge.w)) {
                edges.add(edge)
                set.union(edge.v, edge.w)
                weight += edge.weight
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