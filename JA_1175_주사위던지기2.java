package algo_basic.day3;

import java.util.Scanner;

public class JA_1175_주사위던지기2 {
	static int n,m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		int[] temp = new int[n];
		roll(0,0,temp);
		
	}
	public static void roll(int depth,int sum,int[] temp) {
		if(depth == n) {
			if(sum == m) {
			for (int i = 0; i < temp.length; i++) {
				System.out.printf("%d ",temp[i]);
			}
			System.out.println();
			}
			return;
		}
		for (int i = 1; i <= 6; i++) {
			temp[depth] = i;
			roll(depth+1,sum+temp[depth],temp);
		}
	}
}
