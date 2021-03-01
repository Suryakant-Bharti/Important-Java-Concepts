

package algo.geometry.convexhull

import algo.geometry.Point

class Quickhull: ConvexHullAlgorithm {
    override fun convexHull(points: Array<Point>): Collection<Point> {
        if (points.size < 3) throw IllegalArgumentException("there must be at least 3 points")
        val left = points.min()!!
        val right = points.max()!!
        return quickHull(points.asList(), left, right) + quickHull(points.asList(), right, left)
    }

    private fun quickHull(points: Collection<Point>, first: Point, second: Point): Collection<Point> {
        val pointsLeftOfLine = points
                .filter { it.isLeftOfLine(first, second) }
                .map { Pair(it, it.distanceToLine(first, second)) }
        if (pointsLeftOfLine.isEmpty()) {
            return listOf(second)
        } else {
            val max = pointsLeftOfLine.maxBy { it.second }!!.first
            val newPoints = pointsLeftOfLine.map { it.first }
            return quickHull(newPoints, first, max) + quickHull(newPoints, max, second)
        }
    }
}
