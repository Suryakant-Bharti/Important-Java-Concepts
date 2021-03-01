

package algo.geometry.convexhull

import algo.geometry.Point

interface ConvexHullAlgorithm {
    fun convexHull(points: Array<Point>): Collection<Point>
}
