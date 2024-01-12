

package algo.geometry

/**
 * Naïve implementation, takes O(N) for each request.
 */
class Voronoi(private val points: Collection<Point>, private val distanceFunc: (Point, Point) -> (Double)) {

    val count: Int
        get() = points.size

    fun region(p: Point): Point {
        return points.minBy { distanceFunc(p, it) }!!
    }

    init {
        if (points.isEmpty()) throw IllegalArgumentException("points must be non empty")
    }
}
