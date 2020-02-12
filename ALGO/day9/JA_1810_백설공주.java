package algo_basic.day9;

import java.util.Scanner;

public class JA_1810_백설공주 {
	static int[] arr = new int[9];
	static int[] temp = new int[7];
	
	public static void dfs(int depth,int sum,int start) {
		if(depth == 7) {
			
			if(sum == 100) {
				for (int i = 0; i < temp.length; i++) {
					System.out.println(temp[i]);
				}
				return;
			}
			return;
		}
		for (int i = start; i < arr.length; i++) {
			temp[depth] = arr[i];
			sum+=arr[i];
			dfs(depth+1,sum,i+1);
			sum-=arr[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		dfs(0,0,0);
	}
}
