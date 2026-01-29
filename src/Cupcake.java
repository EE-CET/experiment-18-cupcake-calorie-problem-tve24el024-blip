import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] calories = new long[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }

        // Sort in descending order
        Arrays.sort(calories);

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[n - 1 - i] * (1L << i);
        }

        System.out.println(miles);
        sc.close();
    }
}
