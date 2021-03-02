

package algo.datastructures

import algo.search.BinarySearch

/**
 * The class represents set of comparables. The values are stored in a sorted array,
 * and the inclusion queries perform binary search, taking logarithmic time in the worst case.
 */
class ImmutableSet<T: Comparable<T>>(values: Array<T>): Set<T> {
    private val arr: Array<T> = values.sortedArray()
    private val bs = BinarySearch<T>() // TODO: remove

    override val size: Int
        get() = arr.size

    override fun contains(element: T): Boolean {
        return bs.perform(arr, element) != -1
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return elements.all { contains(it) }
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun iterator(): Iterator<T> {
        return arr.iterator()
    }
}

fun <T: Comparable<T>> immutableSetOf(vararg elements: T): ImmutableSet<out T> {
    return ImmutableSet(elements.copyOf())
}
