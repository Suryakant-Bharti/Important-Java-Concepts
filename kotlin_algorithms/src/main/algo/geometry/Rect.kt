

package algo.geometry

data class Rect(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
    val width = x2 - x1
    val height = y2 - y1
    val origin = Point(x1, y1)
    val center = Point(origin.x + width / 2, origin.y + height / 2)
    val TL = origin
    val BR = Point(origin.x + width, origin.y + height)

    constructor(TL: Point, BR: Point) : this(TL, (BR.x - TL.x), (BR.y - TL.y))

    constructor(origin: Point, width: Int, height: Int) : this(origin.x, origin.y, origin.x + width, origin.y + height)

    fun isInside(point: Point): Boolean =
            point.x >= origin.x && point.y >= origin.y &&
                    point.x <= origin.x + width && point.y <= origin.y + height

    fun cover(point: Point): Rect =
            Rect(Point(minOf(x1, point.x), minOf(y1, point.y)), Point(maxOf(x2, point.x), maxOf(y2, point.y)))

    fun intersects(other: Rect) =
            !(other.x1 > this.x2 || other.x2 < this.x1 || other.y1 > this.y2 || other.y2 < this.y1)
}
