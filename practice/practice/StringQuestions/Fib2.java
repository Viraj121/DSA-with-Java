package practice.StringQuestions;

class Fib2 {
  public static void PrintFib(int a,int b,int n){
   
    if (n==0) {
      return;
    }

    int c=a+b;
    System.out.print(" "+c);
    PrintFib(b,c,n-1);
    
  }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int num=10;
        System.out.print(a+" "+b+" ");

        // for (int i = 2; i < num; i++) {
        //   int c=a+b;
        //   a=b;
        //   b=c;
        //   System.out.print(" " +c);
        // }

        PrintFib(a,b,num-2);

    }
}
