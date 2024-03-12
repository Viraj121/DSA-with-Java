import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int data) {
        s1.push(data);
    }

    int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int ans=s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return ans;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        // Testing push and pop
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop()); // Should print 1
        System.out.println(queue.pop()); // Should print 2
    }
}
