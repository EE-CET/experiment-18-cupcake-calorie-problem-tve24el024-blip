import java.util.Arrays;
import java.util.Scanner;

class Cupcake{

    static long minimumMiles(int[] calories, int n) {
        // Sort in ascending order
        Arrays.sort(calories);

        long miles = 0;
        long power = 1; // represents 2^j

        // Traverse from largest to smallest calorie
        for (int i = n - 1; i >= 0; i--) {
            miles += calories[i] * power;
            power *= 2;
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
