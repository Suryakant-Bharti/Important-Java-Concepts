

package algo.search

class LinearSearch<T>: AbstractSearchStrategy<T>() {
    override fun perform(arr: Array<T>, element: T): Int {
        for ((i, a) in arr.withIndex()) {
            if (a == element) {
                return i
            }
        }
        return -1
    }
}
