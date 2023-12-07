# Arrays!
#### What are arrays?
* Arrays are the simplest data structure, they are like individual boxs of the same data elements.
#### Array Advantages:
* **Easy to use**
* **Random access**, each element can be accessed directly by using its index number.
#### Array Disadvantages:
* **Fixed size**, typical arrays are fixed in size in Java.
* Difficult to insert or delete data
### ArrayList/List methods & time complexity
* **add(E element)**, O(1) amortized, but can be O(n) if array needs to be resized.
* **add(int index, E element)**, O(n) (shift elements to make room or to fill the gap).
* **contains(Object o)**, O(n)
* **get(int index)**, O(1)
* **indexOf(Object o)**, O(n)
* **remove(Object o), remove(int index)**, O(n)

#### Typical Leetcode Patterns:
* [Two pointers](https://www.geeksforgeeks.org/two-pointers-technique/)
* [Sliding Window](https://www.geeksforgeeks.org/window-sliding-technique/)
* **