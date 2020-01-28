package algo_basic.day1;

import java.util.Scanner;

public class SWEA_사전평가_D3_햄버거다이어트 {
	static int n;
	static int score;
	static int max;
	static int[] num,cal;


	public static void dfs(int start,int sum,int mans){
		if(start+1 > n) {
			if(mans > max && score >= sum) max = mans;
				return;
			
		}
		dfs(start+1,sum,mans);
		dfs(start+1,sum+cal[start],mans+num[start]);
	}		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		for (int tc = 1; tc <= TC; tc++) {

			max = 0;
			n = scanner.nextInt();
			score = scanner.nextInt();
			num = new int[n];
			cal = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
				cal[i] = scanner.nextInt();
			}
			dfs(0,0,0);
			System.out.format("#%d %d",tc,max);
		}
		scanner.close();
	}

}

