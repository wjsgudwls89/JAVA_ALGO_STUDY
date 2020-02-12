package algo_basic.day9;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ14501 {
	static int n;
	static int[] visit;
	static int[][] arr = new int[16][2];
	static int ans = 0;
	public static void DFS(int i,int sum) {
		int temp = i+arr[i][0]-1;
//		System.out.println(i);
//		System.out.println(Arrays.toString(visit));
		if(i == n+1) { 
			return;
		}
		if(temp >= n+1) {
			
			return;
		}
		
		
		
		//System.out.println(sum);
		ans = Math.max(sum, ans);
		
		for (int j = i; j <= n ; j++) {
			if(visit[j] == 0) {
				if(j+arr[j][0] > n+1) continue;
				else {
				for (int k = j; k < j+arr[j][0]; k++) {
					visit[k] = 1;
				}
				sum+=arr[j][1];
				DFS(j,sum);
				sum-=arr[j][1];
				for (int k = j; k < j+arr[j][0]; k++) {
					visit[k] = 0;
				}
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			visit = new int[16];
			DFS(i,0);
		}
		System.out.println(ans);
	}

}
