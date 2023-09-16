import java.util.Scanner;

class gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		sc.close();

		while (a % b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;

		}
		System.out.println("GCD is " + b);
	}
}