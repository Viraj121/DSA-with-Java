import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int data) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        q1.add(data);

        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    int pop() {
        return q1.poll();
    }

    public static void main(String[] args) {
        StackUsingQueue stack =new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element "+stack.pop());
    }
}
