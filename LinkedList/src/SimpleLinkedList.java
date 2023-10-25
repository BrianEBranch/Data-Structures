public class SimpleLinkedList<T>{
    /*
    My own implementation of LinkedList class, methods to be added.
     */
    public static void main(String[] args){

    }
    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node(T data){
            this.data = data;
            next = null;
        }
        private Node(T newData, Node nextNode){
            data = newData;
            next = nextNode;
        }
    }

    private Node head;
    private int size;

    public SimpleLinkedList(){
        head = null;
        size = 0;
    }
    //method to add a new node at the end of the linked list.
    public void add(T newItem){
        Node<T> temporaryNode = new Node<>(newItem);
        if(head == null){
            head = temporaryNode;
        }
        else{
            Node<T> thisNode = head;
            while(thisNode.next != null){
                thisNode = thisNode.next;
            }
            thisNode.next = temporaryNode;
        }
    }
    //add at a certain position
    public void add(int position, T newItem){
        Node<T> temporaryNode = new Node<>(newItem);
        if(position > size){
            System.out.println("Position is not in linked list");
            return;
        }
        //if position is the head replace head with new node
        if(position == 1){
            Node<T> node = head;
            head = temporaryNode;
            head.next = node;
            return;
        }
        Node<T> temp = head;
        Node<T> previousNode = new Node<T>(null);
        while(position - 1 > 0){
            previousNode = temp;
            temp = temp.next;
            position--;
        }
        previousNode.next = new Node<>(newItem);
        previousNode.next.next = temp;
    }
}
