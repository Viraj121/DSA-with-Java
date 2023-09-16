import java.util.Scanner;

public class perfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        boolean b = Isperfect(n);

        if (b) {
            System.out.println("perfect number");
        } else {
            System.out.println("Not perfect number");
        }
    }

    static boolean Isperfect(int n) {

        int sum = 0;

        for (int i = 1; i <=n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (n == sum)
            return true;

        return false;
    }
}
