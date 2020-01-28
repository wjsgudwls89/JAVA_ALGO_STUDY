import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063_D1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] k = new int[N];
        for (int i = 0; i < N; i++) {
            k[i] = scanner.nextInt();
        }
        N = N/2;
        Arrays.sort(k);
        System.out.println(k[N]);
    }
}
