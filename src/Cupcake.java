import java.util.Scanner;

public class Cupcake {

    public static long calcount(int n, int[] arr) {
        long calories = 0;
        long multiplier = 1;

        for (int i = 0; i < n; i++) {
            calories += arr[i] * multiplier;
            multiplier *= 2;
        }
        return calories;
    }

    public static void bubblesort(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        bubblesort(n, arr);
        long result = calcount(n, arr);
        System.out.println(result);
    }
}