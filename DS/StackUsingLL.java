import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Push operation: Enqueue the element into queue1
    void push(int element) {
        // Enqueue the new element to the front of the queue
        queue1.add(element);

        // Move all elements from queue2 to queue1
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }

        // Swap the references of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop operation: Dequeue from queue2
    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        // Dequeue from the front of queue2
        return queue2.poll();
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return queue2.isEmpty();
    }

    // Get the size of the stack
    int size() {
        return queue2.size();
    }
}

public class StackUsingLL {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

