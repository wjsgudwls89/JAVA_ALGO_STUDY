package algo_basic.day3;

import java.util.Scanner;

public class JA_1169_주사위던지기1 {
	static int[] dice = {1,2,3,4,5,6};
	static boolean[] visit;
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		visit = new boolean[6];
		n = sc.nextInt();
		m = sc.nextInt();
		int[] temp = new int[n];
		if(m == 1) {
			roll1(0,temp);
		}
		else if (m == 2) {
			roll2(0,0,temp);
		}
		else if (m == 3) {
			roll3(0,temp);
		}
	}
	public static void roll1(int depth,int[] temp) {
		if(depth == n) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%d ",temp[i]);
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < 6; i++) {
			temp[depth] = dice[i]; 
			roll1(depth+1,temp);
		}
	}
	public static void roll3(int depth,int[] temp) {
		if(depth == n) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%d ",temp[i]);
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < 6; i++) {
			if(!visit[i]) {
				visit[i] = true;
				temp[depth] = dice[i]; 
				roll3(depth+1,temp);
				visit[i] = false;
			}
		}
	}
	public static void roll2(int depth,int start,int temp[]) {
		if(depth == n) {
			for (int i = 0; i < n; i++) {
				System.out.printf("%d ",temp[i]);
			}
			System.out.println();
			return;
		}
		for (int i = start; i < 6; i++) {
				temp[depth] = dice[i]; 
				roll2(depth+1,i,temp);
			}
		}
	

}
