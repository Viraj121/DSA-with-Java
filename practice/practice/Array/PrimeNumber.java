package practice.Array;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        scanner.close();

        System.out.println("Prime numbers up to " + upperBound + ":");
        printPrimes(upperBound);
    }

    private static void printPrimes(int upperBound) {
        // Step 1: Create a boolean array isPrime[] and initialize all entries as true.
        boolean[] isPrime = new boolean[upperBound + 1];
        for (int i = 2; i <= upperBound; i++) {
            isPrime[i] = true;
        }

        // Step 2: Iterate through numbers starting from 2.
        // For each prime number found, mark its multiples as non-prime.
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                //i*i is the initialization condition hai becoz direct 3 * 3 = 9 se shuru karne ke liye bcoz iske phele wali prime number mark hogaye honge...
                //band meh sirf condition and increment work hoga initialization ka kaam khatam.
                for (int j = i * i; j <= upperBound; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Print the prime numbers.
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
