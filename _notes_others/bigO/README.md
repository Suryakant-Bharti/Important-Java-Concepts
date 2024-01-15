# Time Complexity (Big-O) Cheatsheet

Big O, Big Theta and Big Omega notations express an algorithm’s time and space complexity. It helps us to quantify the efficiency of our code.

- **Big O:** Worst-case performance of an algorithm.
- **Big Theta (Θ):** Average performance of an algorithm.
- **Big Omega (Ω):** Best-case performance of an algorithm.

## Common Data Structures

![common datastructures](https://github.com/Suryakant-Bharti/Important-Java-Concepts/assets/2780145/fd776e01-1887-4c50-bc3f-6712d29eec0a)

## Sorting Algorithms

![sorting_algorithms](https://github.com/Suryakant-Bharti/Important-Java-Concepts/assets/2780145/d8d54a3e-55de-4321-afc1-eda8f01aea60)

## Others Algorithms

**Linear Search** - O(n)

**Binary Search** - O(logn)

**Set** - Add/remove/search: O(1)

**Heap** (it is always balanced):
- add/delete O(logn)
- search O(n)
- search min/max O(1)

**Dynamic Programming** : 
- Space Complexity O(n)
- Time Complexity O(n.k), k is work done in each step

**Recursion** : mostly true for Backtracking also
- if calls itself 2 times, O(2^n)
- if calls itself 3 times, O(3^n)

**Divide and Conquer**

**Greedy**

## Input size, Complexity & Algo guess

- **n <= 10:** ```maybe O(n^2.n!) or O(4^n)``` - backtracking or brute-force recursive
- **10 < n <= 20:** ```O(2^n)``` - backtracking and recursion
- **20 < n <= 100:** ```O(n^3)``` - nested loops
- **100 < n <= 1,000:** ```O(n^2)``` - nested loops with something efficient
- **1,000 < n < 100,000:** ```O(n.logn) or O(n)``` - hashmap, 2 pointers, sliding window, monotonic stack, binary search, heap
- **100,000 < n < 1,000,000:** ```O(n) or O(n.logn)``` with small k - maybe hashmap or binary search
- **1,000,000 < n:** ```O(logn) or O(1)``` - math formula, binary search or hashmap

