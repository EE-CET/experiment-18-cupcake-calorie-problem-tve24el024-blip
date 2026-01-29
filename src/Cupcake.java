import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr); // ascending

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[n - 1 - i] * (1L << i);
        }

        System.out.println(result);
    }
}
