![alt text](kotlin-algorithm-club.png "Logo Title Text 1")

[![Kotlin](https://img.shields.io/badge/kotlin-1.2.41-blue.svg)](http://kotlinlang.org)
[![License](https://img.shields.io/github/license/bmaslakov/kotlin-algorithm-club.svg)](LICENSE)
[![codebeat badge](https://codebeat.co/badges/9a90c6ce-eb29-4cd3-9e92-ed64181784dc)](https://codebeat.co/projects/github-com-bmaslakov-kotlin-algorithm-club-master)

Here you can find the most common algorithms and data structures written in Kotlin.

The goal of this project is to create the most eloquent implementations of old algorithms in the new language. The code is meant to be as self-describing as possible, so I do not plan to include much documentation. It is assumed that you know the basics; if you want to learn algorithms perhaps it is a wrong place. I do full-heartedly recommend [The Algorithm Design Manual by Steven Skiena](https://www.amazon.com/Algorithm-Design-Manual-Steven-Skiena/dp/1848000693) and of course...
 
## [Algorithms, 4th Edition](http://algs4.cs.princeton.edu/home/)

This project is inspired by and based on wonderful works of [Robert Sedgewick](http://www.cs.princeton.edu/~rs/) and [Kevin Wayne](http://www.cs.princeton.edu/~wayne/contact/). Most of the implementations were taken from the [algs4](https://github.com/kevin-wayne/algs4) library.

## List of the algorithms

##### Sorting

- [Insertion Sort](src/main/io/uuddlrlrba/ktalgs/sorts/InsertionSort.kt)
- [Selection Sort](src/main/io/uuddlrlrba/ktalgs/sorts/SelectionSort.kt)
- [Bubble Sort](src/main/io/uuddlrlrba/ktalgs/sorts/BubbleSort.kt)
- [Merge Sort](src/main/io/uuddlrlrba/ktalgs/sorts/MergeSort.kt)
- [Quick Sort](src/main/io/uuddlrlrba/ktalgs/sorts/QuickSort.kt)
- [Shell Sort](src/main/io/uuddlrlrba/ktalgs/sorts/ShellSort.kt)
- [Heap Sort](src/main/io/uuddlrlrba/ktalgs/sorts/HeapSort.kt)

##### Data Structures

- [Queue](src/main/io/uuddlrlrba/ktalgs/datastructures/Queue.kt)
- [Stack](src/main/io/uuddlrlrba/ktalgs/datastructures/Stack.kt)
- [Dequeue](src/main/io/uuddlrlrba/ktalgs/datastructures/Dequeue.kt)
- [Priority Queue](src/main/io/uuddlrlrba/ktalgs/datastructures/PriorityQueue.kt)
- [Indexed Priority Queue](src/main/io/uuddlrlrba/ktalgs/datastructures/IndexedPriorityQueue.kt)
- [Disjoint Set (Union Find)](src/main/io/uuddlrlrba/ktalgs/datastructures/DisjointSet.kt)
- [Tree](src/main/io/uuddlrlrba/ktalgs/datastructures/tree/Tree.kt)
- [Binary Tree](src/main/io/uuddlrlrba/ktalgs/datastructures/tree/BinaryTree.kt)
- [Binary Search Tree](src/main/io/uuddlrlrba/ktalgs/datastructures/tree/BinarySearchTree.kt)
- [Immutable Set (based on binary search)](src/main/io/uuddlrlrba/ktalgs/datastructures/tree/ImmutableSet.kt)

##### Search

- [Linear Search](src/main/io/uuddlrlrba/ktalgs/search/LinearSearch.kt)
- [Binary Search](src/main/io/uuddlrlrba/ktalgs/search/BinarySearch.kt)

##### Graphs

- [Breadth First Search](src/main/io/uuddlrlrba/ktalgs/graphs/BFS.kt)
- [Depth First Search](src/main/io/uuddlrlrba/ktalgs/graphs/DFS.kt)
- [Kruskal's minimum spanning tree](src/main/io/uuddlrlrba/ktalgs/graphs/undirected/weighted/KruskalMST.kt)
- [Prim's minimum spanning tree](src/main/io/uuddlrlrba/ktalgs/graphs/undirected/weighted/PrimMST.kt)
- [Boruvka's minimum spanning tree](src/main/io/uuddlrlrba/ktalgs/graphs/undirected/weighted/BoruvkaMST.kt)
- [Dijkstra's shortest paths](src/main/io/uuddlrlrba/ktalgs/graphs/directed/weighted/Dijkstra.kt)

##### Math

- [GCD / LCM](src/main/io/uuddlrlrba/ktalgs/math/Gcd.kt)
- [Newton Method](src/main/io/uuddlrlrba/ktalgs/math/NewtonMethod.kt)
- [Binomial](src/main/io/uuddlrlrba/ktalgs/math/Binomial.kt)

##### Geometry

- [Gift wrapping (Jarvis)](src/main/io/uuddlrlrba/ktalgs/geometry/convexhull/GiftWrapping.kt)
- [Graham Scan](src/main/io/uuddlrlrba/ktalgs/geometry/convexhull/GrahamScan.kt)
- [Quickhull](src/main/io/uuddlrlrba/ktalgs/geometry/convexhull/Quickhull.kt)
- [Voronoi Diagram (Naïve implementation)](src/main/io/uuddlrlrba/ktalgs/geometry/Voronoi.kt)
- [Sierpinski triangle](src/main/io/uuddlrlrba/ktalgs/geometry/SierpinskiTriangle.kt)

##### Substring search

- [Knuth–Morris–Pratt (KMP)](src/main/io/uuddlrlrba/ktalgs/substring/KMP.kt)

## License

Kotlin algorithm club is released under the [MIT License](https://opensource.org/licenses/MIT).
