import java.util.Arrays;
import java.util.Scanner;

class Cupcake{

    static long minimumMiles(int[] calories, int n) {
        // Sort ascending
        Arrays.sort(calories);

        long miles = 0;
        long power = 1; // 2^0

        // Traverse from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            miles += calories[i] * power;
            power <<= 1; // multiply by 2
        }

        return miles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] calories = new int[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        System.out.print(minimumMiles(calories, n));
        sc.close();
    }
}
