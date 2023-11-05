public class Fibonacci {

    //using recurrsion..
    public static void PrintFib(int a, int b, int n) {

        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(" " + c);

        PrintFib(b, c, n - 1);

    }

    public static void main(String[] args) {

        //normal way..
        
        // int num = 15;
        // int a = 0, b = 1;

        // // Here we are printing 0th and 1st terms
        // System.out.print(a + "  " + b + "  ");

        // int nextTerm;

        // // printing the rest of the terms here
        // for (int i = 2; i < num; i++) {
        //     nextTerm = a + b;
        //     a = b;
        //     b = nextTerm;
        //     System.out.print(nextTerm + "  ");
        // }

          int a = 0, b = 1;
        int n = 7;
        System.out.print(a + " " + b);
        PrintFib(a, b, n - 2);

        
    }


}
