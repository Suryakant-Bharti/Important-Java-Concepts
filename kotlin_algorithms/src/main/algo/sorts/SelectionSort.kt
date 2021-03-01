

package algo.sorts

/**
 * Selection sort is a simple sorting algorithm dividing the input list into two parts: the sublist of items already
 * sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining
 * to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist
 * is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order)
 * element in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element
 * (putting it in sorted order), and moving the sublist boundaries one element to the right.
 */
@ComparisonSort
@UnstableSort
class SelectionSort : AbstractSortStrategy() {
    public override fun<T : Comparable<T>> perform(arr: Array<T>) {
        for (i in arr.indices) {
            var min = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[min]) {
                    min = j
                }
            }
            if (min != i) arr.exch(min, i)
        }
    }
}
