

package algo.math

/**
 * This calculates C(n,k). How many ways can k be chosen from n?
 */
fun binomial(n: Int, k: Int): Long {
    var j = n - k + 1
    var binomial = 1L
    for (i in 1 until k + 1) {
        binomial = binomial * j / i
        j++
    }
    return binomial
}
