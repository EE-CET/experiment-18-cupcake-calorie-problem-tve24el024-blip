import java.util.Arrays;
import java.util.Scanner;

class Cupcake{

    static long minimumMiles(int[] calories, int n) {
        // Sort in ascending order
        Arrays.sort(calories);

        long miles = 0;

        // Apply from largest to smallest explicitly
        for (int i = 0; i < n; i++) {
            int calorie = calories[n - 1 - i]; // reverse access
            miles += calorie * (1L << i);      // 2^i
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
