package algo_basic.day7;

import java.util.Arrays;

public class Permutation {

	static int[] src = {1,2,3};
	static int[] visit= new int[src.length];
	static int[] temp = new int[src.length];

	public static void dfs(int k,int input) {

		if(k == input) {
			System.out.println(Arrays.toString(temp));
			//Print();
			return;
		}
		else {
			for (int i = 0; i < visit.length; i++) {
				if(visit[i] == 0) {
					visit[i] = 1;
					temp[k] = src[i];
					dfs(k+1,input);
					visit[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= src.length; i++) {
			dfs(0,i);
		}
	}
	public static void Print() {
		for (int i = 0; i < src.length; i++) {
			if(visit[i] == 1) {
				System.out.print(temp[i]);
			}

			else {
				continue;
			}

		}
		System.out.println();
	}
}
