import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(11);

        System.out.println(st.pop());

        Queue <Integer> queue=new LinkedList<>(); 
        queue.add(12);
        queue.add(89);
        queue.add(1);

        System.out.println(queue.remove());


    }
}
