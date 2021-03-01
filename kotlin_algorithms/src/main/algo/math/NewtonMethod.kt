

package algo.math

fun sqrt(c: Int, e: Double = 1e-15): Double {
    return sqrt(c.toDouble(), e)
}

fun sqrt(c: Double, e: Double = 1e-15): Double {
    if (c < 0) return Double.NaN
    var t = c
    while (Math.abs(t - c / t) > e * t)
        t = (c / t + t) / 2.0
    return t
}
