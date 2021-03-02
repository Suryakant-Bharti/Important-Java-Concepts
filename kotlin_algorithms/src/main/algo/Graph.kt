

package algo.graphs

interface Graph {
    public val V: Int
    public var E: Int
    public fun adjacentVertices(from: Int): Collection<Int>

    public fun vertices(): IntRange = 0 until V
}
