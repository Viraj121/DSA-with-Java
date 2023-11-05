package practice;

class Fib2 {
  static void PrintFib(int a,int b,int n){
    if(n==0)
       return;

    int c=a+b;

    System.out.print(c+" ");

    PrintFib(b, c, n-1);
    
  }

    public static void main(String[] args) {
        int num=15;
        int a=0,b=1;

        System.out.print(a+ " "+b+ " ");

        // int nextTerm;

        // for(int i=2;i<num;i++){
        //     nextTerm=a+b;
        //     a=b;
        //     b=nextTerm;
        //     System.out.print(nextTerm+" ");
        // }

        PrintFib(a,b,num-2);


    }
}
