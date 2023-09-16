//recursion level 1 problems

public class practive {

    public static void PrintNumber10to1(int n) {
        if (n == 0)
            return;

        System.out.println(n);

        PrintNumber10to1(n - 1);

    }

    public static void PrintNumberfrom1to10(int n) {
        if (n == 11)
            return;

        System.out.println(n);

        PrintNumberfrom1to10(n + 1);
    }

    public static void PrintSum(int i, int n, int sum) {
        // base case
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        PrintSum(i + 1, n, sum);
        System.out.println(i);//
    }

    public static int calFactorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_nm1 = calFactorial(n - 1);
        int fact = n * fact_nm1;
        return fact;

    }

    public static void PrintFib(int a, int b, int n) {

        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(" " + c);

        PrintFib(b, c, n - 1);

    }

    public static int calPower(int x, int n) {

        if (x == 0)
            return 0;

        if (n == 0) {
            return 1;
        } 

        int xPownm1 = calPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static int calPower_inlogn(int x, int n) {

        if (n == 0) {
            return 1;
        } 

        if(n%2==0){
            return calPower_inlogn(x,n/2)*calPower_inlogn(x,n/2);
        }else{
            return x*calPower_inlogn(x, n/2)*calPower_inlogn(x, n/2);
        }

    }

    public static void main(String[] args) {
        // int ans = calFactorial(5);
        // System.out.println(ans);

        // int a = 0, b = 1;
        // int n = 7;
        // System.out.print(a + " " + b);
        // PrintFib(a, b, n - 2);

        int x = 2, n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);

    }
}
