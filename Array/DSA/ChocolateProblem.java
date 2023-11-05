package DSA;

import java.util.ArrayList;
import java.util.Comparator;

public class ChocolateProblem {

    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {

        if (m == 0 || n == 0) {
            return 0;
        }

        a.sort(Comparator.naturalOrder());

        if (m > n) {
            return -1;
        }

        int min_diff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = a.get(i + m - 1) - a.get(i);

            if (diff < min_diff) {
                min_diff = diff;
            }
        }
        return min_diff;
    }

    public static void main(String[] args) {

        // Input:
        // N = 8, M = 5
        // A = {3, 4, 1, 9, 56, 7, 9, 12}
        // Output: 6
        // Explanation: The minimum difference between maximum chocolates and minimum
        // chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.

    }
}
