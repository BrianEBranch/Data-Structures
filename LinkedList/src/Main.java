import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main extends SimpleLinkedList {
    /*
    Can have a doubly linked list which is connected both forward and backward, circular linked list which is where all
    nodes are connected to form a circle, or a singly linked list which is only connected forward.
    Can be implement using ArrayDeque, ArrayList, LinkedList, or we can implement it ourselves using nodes and creating
    our own methods
     */
    public static void main(String[] args) {
        /*
        Each of these come with their own prebuilt functions to add remove, etc.
         */
        //LinkedList
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        //ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        //ArrayDeque
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        //Our own created list:
        SimpleLinkedList<Integer> integerSimpleLinkedList = new SimpleLinkedList<>();
    }
}