package practice;

import java.util.Scanner;

public class palindrom2 {
   public static void main(String[] args) {
    System.out.println("enter the number: ");
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    sc.close();

    if(isPalindrome(n))
       System.out.println("hai");
    else
      System.out.println("nahi hai");
   } 

   public static boolean isPalindrome(int n){
    int palindrome=n;

    int reverse=0;

    while(palindrome!=0){
        int remainder=palindrome%10;
        palindrome=palindrome/10;
        reverse=reverse*10+remainder;
    }

    if (n==reverse) {
        return true;
    }


    return false;
   }
}

class palindrom3{
    public static void main(String[] args) {
        String original,reverse="";

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number/word");
        original=sc.nextLine();
        sc.close();
        int length=original.length();

        for (int i = length-1; i>=0; i--) {
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("it is palindrome");

        }else{
            System.out.println("its not");
        }
    }
}