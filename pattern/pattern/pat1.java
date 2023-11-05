package pattern;

public class pat1 {
    public static void main(String[] args) {

        int m = 4;
        int n = 5;

        // solid rectangle

        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // hollow rectangle

        // for(int i=1;i<=m;i++){
        // for(int j=1;j<=n;j++){

        // if(i==1 || j==1 || i==m ||j==n){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid

        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Inverted half pyramid

        // for (int i = m; i >= 1; i--) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // inverted and rotated half pyramid

        // for (int i = 1; i <= n; i++) {

        // //space ko print
        // for (int j = 1; j <= n-i; j++) {
        // System.out.print(" ");
        // }

        // //star print
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // half pyramid with number

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // inverted half pyramid with number

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // floyd's trianle

        // int number = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }

        // 0-1 triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
