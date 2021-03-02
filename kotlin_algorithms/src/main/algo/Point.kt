

package algo.geometry

data class Point(val x: Int, val y: Int): Comparable<Point> {
    override fun compareTo(other: Point): Int {
        if (x == other.x) return y.compareTo(other.y)
        return x.compareTo(other.x)
    }

    fun isLeftOfLine(from: Point, to: Point): Boolean {
        return crossProduct(from, to) > 0
    }

    fun crossProduct(origin: Point, p2: Point): Int {
        return (p2.x - origin.x) * (this.y - origin.y) - (p2.y - origin.y) * (this.x - origin.x)
    }

    fun distanceToLine(a: Point, b: Point): Double {
        return Math.abs((b.x - a.x) * (a.y - this.y) - (a.x - this.x) * (b.y - a.y)) /
                Math.sqrt(Math.pow((b.x - a.x).toDouble(), 2.0) + Math.pow((b.y - a.y).toDouble(), 2.0))
    }

    fun euclideanDistanceTo(that: Point): Double {
        return EUCLIDEAN_DISTANCE_FUNC(this, that)
    }

    fun manhattanDistanceTo(that: Point): Double {
        return MANHATTAN_DISTANCE_FUNC(this, that)
    }

    companion object {
        // < 0 : Counterclockwise
        // = 0 : p, q and r are colinear
        // > 0 : Clockwise
        fun orientation(p: Point, q: Point, r: Point): Int {
            return (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y)
        }

        val EUCLIDEAN_DISTANCE_FUNC: (Point, Point) -> (Double) = { p, q ->
            val dx = p.x - q.x
            val dy = p.y - q.y
            Math.sqrt((dx * dx + dy * dy).toDouble())
        }

        val MANHATTAN_DISTANCE_FUNC: (Point, Point) -> (Double) = { p, q ->
            val dx = p.x - q.x
            val dy = p.y - q.y
            Math.sqrt((dx * dx + dy * dy).toDouble())
        }
    }
}