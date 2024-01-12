

package algo.graphs.undirected.weighted

interface MST {
    /**
     * Returns the edges in a minimum spanning tree (or forest).
     * @return the edges in a minimum spanning tree (or forest) as
     * *    an iterable of edges
     */
    fun edges(): Iterable<UWGraph.Edge>

    /**
     * Returns the sum of the edge weights in a minimum spanning tree (or forest).
     * @return the sum of the edge weights in a minimum spanning tree (or forest)
     */
    fun weight(): Double
}
