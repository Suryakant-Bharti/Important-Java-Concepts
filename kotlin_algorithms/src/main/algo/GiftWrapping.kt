

package algo.geometry.convexhull

import algo.datastructures.Stack
import algo.geometry.Point

class GiftWrapping: ConvexHullAlgorithm {
    override fun convexHull(points: Array<Point>): Collection<Point> {
        if (points.size < 3) throw IllegalArgumentException("there must be at least 3 points")

        val hull = Stack<Point>()

        // Find the leftmost point
        var l = 0
        points.indices
                .asSequence()
                .filter { points[it].x < points[l].x }
                .forEach { l = it }

        // Start from leftmost point, keep moving counterclockwise
        // until reach the start point again.  This loop runs O(h)
        // times where h is number of points in result or output.
        var p = l
        var q: Int
        do {
            // Add current point to result
            hull.push(points[p])

            // Search for a point 'q' such that orientation(p, x,
            // q) is counterclockwise for all points 'x'. The idea
            // is to keep track of last visited most counterclock-
            // wise point in q. If any point 'i' is more counterclock-
            // wise than q, then update q.
            q = ( p+ 1) % points.size
            points.indices
                    .asSequence()
                    .filter { Point.orientation(points[p], points[it], points[q]) < 0 }
                    .forEach { q = it }

            // Now q is the most counterclockwise with respect to p
            // Set p as q for next iteration, so that q is added to
            // result 'hull'
            p = q

        } while (p != l)  // While we don't come to first point

        return hull
    }
}
