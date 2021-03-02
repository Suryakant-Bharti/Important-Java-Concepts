

package algo.sorts

/**
 * Bubble sort is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares
 * each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated
 * until no swaps are needed, which indicates that the list is sorted. The algorithm, which is a comparison sort,
 * is named for the way smaller or larger elements "bubble" to the top of the list. Although the algorithm is simple,
 * it is too slow and impractical for most problems even when compared to insertion sort. It can be practical
 * if the input is usually in sorted order but may occasionally have some out-of-order elements nearly in position.
 */
@ComparisonSort
@StableSort
class BubbleSort : AbstractSortStrategy() {
    public override fun<T : Comparable<T>> perform(arr: Array<T>) {
        var exchanged: Boolean
        do {
            exchanged = false
            for (i in 1 until arr.size) {
                if (arr[i] < arr[i - 1]) {
                    arr.exch(i, i - 1)
                    exchanged = true
                }
            }
        } while (exchanged)
    }
}
