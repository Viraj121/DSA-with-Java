

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number toh dee");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("what to do?bruuh");
        char op=sc.next().charAt(0);
        int Calc=cal(a,b,op);
        System.out.println(Calc);


        sc.close();
    }
    public static int cal(int a,int b,char op){
        int ans=0;
        if(op == '+'){
            ans=a+b;
        }else if (op == '-'){
            ans=a-b;
        }
        return ans;

    }
}
