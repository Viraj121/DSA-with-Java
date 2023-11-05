// package basic;
import java.util.Scanner;
/**
 * Java program to check if the number is palindrome or not.
 * A number is called palindrome if the number
 * and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */
// class palindrome {

//     public static void main(String args[]){
       
//         System.out.println("Please Enter a number : ");
//         Scanner sc=new Scanner(System.in);
//         int palindrome = sc.nextInt();
        
//     sc.close();
//         if(isPalindrome(palindrome)){
//             System.out.println("Number : " + palindrome
//                    + " is a palindrome");
//         }else{
//             System.out.println("Number : " + palindrome
//                    + " is not a palindrome");
//         }      
       
//     }
 
//     /*
//      * Java method to check if a number is palindrome or not
//      */
//     public static boolean isPalindrome(int number) {
//         int palindrome = number; // copied number into variable
//         int reverse = 0;

//         while (palindrome != 0) {
//             int remainder = palindrome % 10;
//             palindrome = palindrome / 10;
//             reverse = reverse * 10 + remainder;
            
//         }

//         // if original and the reverse of number is equal means
//         // number is palindrome in Java
//         if (number == reverse) {
//             return true;
//         }
//         return false;
//     }

// }


// Read more: https://www.java67.com/2012/09/palindrome-java-program-to-check-number.html#ixzz83e1AY0uT

class Palindrome
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  