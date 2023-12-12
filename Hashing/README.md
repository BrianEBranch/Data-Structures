

<details>
<summary> Common Methods Runtime Complexity </summary>

## HashMap:

    put(K key, V value):
        Adds a key-value pair to the map.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    get(Object key):
        Retrieves the value associated with the specified key.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    remove(Object key):
        Removes the mapping for the specified key.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    containsKey(Object key):
        Checks if the map contains a mapping for the specified key.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    keySet():
        Returns a Set view of the keys contained in the map.
        Time Complexity: O(n) (where n is the size of the map).

    values():
        Returns a Collection view of the values contained in the map.
        Time Complexity: O(n) (where n is the size of the map).

## HashSet:

    add(E e):
        Adds the specified element to the set if it is not already present.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    remove(Object o):
        Removes the specified element from the set if it is present.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    contains(Object o):
        Returns true if the set contains the specified element.
        Time Complexity: O(1) (average-case), O(n) (worst-case due to collisions).

    size():
        Returns the number of elements in the set.
        Time Complexity: O(1).

    isEmpty():
        Returns true if the set contains no elements.
        Time Complexity: O(1).

    clear():
        Removes all of the elements from the set.
        Time Complexity: O(1).
</details>

<details>

<summary> Hash Function </summary>

### Hash Function
The hash function is a crucial component of a hash table. It converts a key into an index within the table, determining where the associated value will be stored.

    Formula: hashCode() % tableSize
    The result is the remainder(int) when the hash code of the key is divided by the size of the hash table
</details>
<details>
<summary> Collision Resolution Methods </summary>

### Open Addressing with Linear Probe

This collision resolution method involves searching for the next available slot in the hash table in a linear fashion.

    Process:
    Start with the home slot (the slot the key is hashed to).
    keep checking the next slot until an empty slot is found. 
        * if end is reached, wrap back around to start.
    Store the new key in this empty slot.

### Separate Chaining

This method involves maintaining a linked list at each slot in the hash table. Collisions are resolved by adding the new key to the linked list for the home slot.

    Process:
        Add the new key to the linked list for the home slot (the slot the key is hashed to).
</details>
<details>

<summary> How Insertion and Retrieval Work in Hash Table (Open Addressing with Linear Probe) </summary>

### Insertion

The insertion process in a hash table using open addressing with linear probe involves finding an empty slot for the new key.

    Process:
        Compute the hash code of the key.
        Calculate the initial position (home slot) using the hash function.
        Check the home slot. If it's empty, insert the key.
        If not, linearly probe to the next slot until an empty slot is found.
        Insert the key into the first empty slot.

### Retrieval

Retrieving a value from a hash table using open addressing with linear probe involves finding the slot where the key is stored.

    Process:
        Compute the hash code of the key.
        Calculate the initial position (home slot) using the hash function.
        Check the home slot. If the key matches, retrieve the associated value.
        If not, linearly probe to the next slot until the key is found or an empty slot is reached.