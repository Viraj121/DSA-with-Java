package pattern;

public class pat3 {
    public static void main(String[] args) {
        int n = 5;
        // int number=1;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
  
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        //exactly opposite pattern 

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {

        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        // 

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)//space ka loop
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //number pyramid
 
        // for(int i=n;i>=n;i--){
        //     for(int j=1;j<=n-1;j++){
        //         System.out.print(j+" ");
        //     }System.out.println();
        // }

        //floyd's triangle

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
