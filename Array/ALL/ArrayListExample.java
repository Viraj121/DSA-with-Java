package ALL;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(4);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println(list.contains(2));

        System.out.println(list);
        list.set(0, 90);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
        sc.close();

    }
}
