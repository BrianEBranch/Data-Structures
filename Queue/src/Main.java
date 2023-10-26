import java.util.ArrayDeque;
import java.util.Deque;
/*
Queue is an abstract Data Strucute. Data is always added to one end, and removed from the other.
Queues use FIFO(First-In-First-Out), for queue you can insert at both front and back.
Cool thing about queue is all operations work in constant time!
 */
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        integerArrayDeque.add(4);
        integerArrayDeque.add(5);
        for(int i = 0; i < integerArrayDeque.size() + 1; i++){
            System.out.println(integerArrayDeque.pop());
        }
    }
}