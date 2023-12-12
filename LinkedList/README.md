# Linked Lists!
#### What are linked lists?
* Linked list are nodes of data that are chained together.
* Each node consists of two things, the data field, and an address that references the next node. 
* Can have a **doubly linked list** which is connected both forward and backward.
* Can have a **singly linked list** which is connected only forward.
* Can have a **circularly linked list** which is connected to form a circle, that is the last node is conncted the first.
* Can be implement using **ArrayDeque,** **ArrayList,** **LinkedList,** or we can implement it ourselves using nodes and creating our own methods
* 

#### Linked list advantages:
* **Dynamic Size,** linked list can easily grow or shrink in size during runtime.  
* **Insertion and Deletion,** inseritng or deleting elements in a linked list, especially in the beginning or middle, is generally faster and mroe efficient that the array.
* **Various Data Structures,** linked list serve as the basis for other importatnt data structures, such as stacks, and queues.
#### Linked list Disadvantages:
* **Slower Random Access,** accessing elements in a linked list, especially singly linked list, is slower than in an array because you have to traverse throught the list to find an element resulting in O(n) time complexitiy.
* **Complexity of implementation,** implementing linked lists can be more complex than using arrays.
* **Difficult Reversal,** reversing a singly linked list is hard!

### LinkedList methods & time complexity
* **add(E element)**, O(1)
* **add(int index, E element)**, O(n) (need to traverse to specified index)
* **get(int index)**, O(n), (traverse to the specified index)
* **remove(Object o), remove(int index)**, O(n)
* **indexOf(Object o)**, O(n)
* **contains(Object o)**, O(n)
