//  package basic;
import java.util.Scanner;

public class RateOfInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE P,R,T");
        float p=sc.nextFloat();
        float t=sc.nextFloat();
        float r=sc.nextFloat();
        float si=(p*t*r)/100;
        System.out.println("Simple interest for the given requirement are: "+si);


        sc.close();
    }
}
