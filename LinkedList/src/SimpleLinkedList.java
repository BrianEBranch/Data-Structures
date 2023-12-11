public class SimpleLinkedList<T>{
    /*
        My own implementation of LinkedList class, methods to be added.
         */
    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node(T data){
            this.data = data;
            next = null;
        }
        private Node(T newData, Node nextNode){
            this.data = newData;
            this.next = nextNode;
        }
    }
    private Node head;
    private int size;
    //create an empty linked list
    public SimpleLinkedList(){
        head = null;
        size = 0;
    }
    //method to remove a node by its data value.
    public boolean removeByValue(T data){
        if(head == null){
            return false;
        }
        if(head.data.equals(data)){
            head = head.next;
            return true;
        }
        Node current = head;
        Node previous = null;
        while(current != null){
            if(current.data.equals(data)){
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
    public Object removeByIndex(int index){
        Node listNode = head;
        Node previousNode;
        int currIndex = 0;
        if(index < 0 || index > size){
            throw new RuntimeException("ERROR: Index out of bound");
        }
        if(index == 0){
            previousNode = listNode;
            head = listNode.next;
            return previousNode.data;
        }
        while(listNode != null){
            previousNode = listNode;
            listNode = listNode.next;
            currIndex++;
            if(currIndex == index){
                previousNode.next = listNode.next;
                return listNode.data;
            }
        }
        return Integer.MIN_VALUE;
    }
    //method to add a new node at the end of the linked list.
    public void add(T newItem){
        Node<T> temporaryNode = new Node<>(newItem);
        if(head == null){
            head = temporaryNode;
        }
        else{
            Node thisNode = head;
            while(thisNode.next != null){
                thisNode = thisNode.next;
            }
            thisNode.next = temporaryNode;
        }
        size++;
    }
    //add at a certain position
    public void add(int index, T newItem){
        Node newNode = new Node(newItem);
        Node listHead = head;
        Node previous = null;
        if(index == size){
            while(listHead != null){
                listHead = listHead.next;
            }
            listHead.next = newNode;
        }
        else if(index == 0){
            newNode.next = listHead;
            head = newNode;
        }
        while(listHead != null){

        }
    }
    public Object get(int index){
        if(index > size || index < 0){
            System.out.println("Index out of bounds");
            throw new RuntimeException("ERROR, index not valid");
        }
        Node listHead = head;
        int counter = 0;
        while(listHead != null){
            if(counter == index){
                return listHead.data;
            }
            listHead = listHead.next;
            counter++;
        }
        return null;
    }
    public int indexOf(T data){
        Node listNode = head;
        int index = 0;
        while(listNode.next != null){
            if(listNode.data.equals(data)){
                return index;
            }
            index++;
            listNode = listNode.next;
        }
        return -1;
    }
    public boolean contains(T data){
        Node listNode = head;
        while(listNode != null){
            if(listNode.data.equals(data)){
                return true;
            }
            listNode = listNode.next;
        }
        return false;
    }
    public int size(){
        Node listHead = head;
        int count = 0;
        while(listHead != null){
            listHead = listHead.next;
            count++;
        }
        return count;
    }
    //returns element at the specified position in this list
}
