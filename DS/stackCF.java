package DS;

import java.util.*;

//Stack implementation using collection framework.
public class stackCF {
    public static void main(String[] args) {
        Stack <Integer> s =new Stack<>();

        s.push(1);
        s.push(3);
        s.push(35);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
