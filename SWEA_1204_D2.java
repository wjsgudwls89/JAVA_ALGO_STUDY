import java.util.Scanner;

public class SWEA_1204_D2 {
    static int N,tcNum,maxidx,maxnum;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int tc = 0; tc < N; tc++) {
            arr = new int[1000];
            maxidx = 0;
            maxnum = 0;
            tcNum = scanner.nextInt();
            for (int i = 0; i < 1000; i++) {
               int score = scanner.nextInt();
                //System.out.printf("%d ",score);
                arr[score]++;
            }
            for (int k = 0; k < 1000; k++) {
                if(arr[k] >= maxnum) {
                    maxnum = arr[k];
                    maxidx = k;
                }
            }
            System.out.printf("#%d %d\n",tc+1,maxidx);
        }
    }
}

