

package algo.graphs.undirected.weighted

import algo.datastructures.DisjointSet
import algo.datastructures.Queue

class BoruvkaMST(G: UWGraph): MST {
    var weight: Double = 0.0
    var edges: Queue<UWGraph.Edge> = Queue()

    init {
        val uf = DisjointSet(G.V)

        // repeat at most log V times or until we have V-1 edges
        var t = 1
        while (t < G.V && edges.size < G.V - 1) {

            // foreach tree in forest, find closest edge
            // if edge weights are equal, ties are broken in favor of first edge in G.edges()
            val closest = arrayOfNulls<UWGraph.Edge>(G.V)
            for (e in G.edges()) {
                val v = e.v
                val w = e.w
                val i = uf.find(v)
                val j = uf.find(w)
                if (i == j) continue   // same tree
                if (closest[i] == null || e < closest[i]!!) closest[i] = e
                if (closest[j] == null || e < closest[j]!!) closest[j] = e
            }

            // add newly discovered edges to MST
            for (i in 0 until G.V) {
                val e = closest[i]
                if (e != null) {
                    val v = e.v
                    val w = e.w
                    // don't add the same edge twice
                    if (!uf.connected(v, w)) {
                        edges.add(e)
                        weight += e.weight
                        uf.union(v, w)
                    }
                }
            }
            t += t
        }
    }

    override fun edges(): Iterable<UWGraph.Edge> {
        return edges
    }

    override fun weight(): Double {
        return weight
    }
}
