package algo_basic.day9;

import java.util.Arrays;

public class PermVsCom {
	
	static char[] src = {'A','B','C','D'};
	static char[] temp = new char[4];
	static int[] visit = new int[4];
	public static void dfs(int depth,int start) {
		if(depth == 2) {
			System.out.println(temp);
			return;
		}
		
		else {
			for (int i = 0; i < 4; i++) {
				if(visit[i] == 0) {
					visit[i] = 1;
				temp[depth] = src[i];
				dfs(depth+1,i+1);
				visit[i] = 0;
				}
			}
		}
	}
	public static void makeCombinations(int depth,int start) {
		if(depth == 3) {
			System.out.println(Arrays.toString(temp));
		}
		else {
			for (int i = start; i < src.length; i++) {
				temp[depth] = src[i];
				makeCombinations(depth+1,i+1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//위배열로 생성할수 있는 순열을 만들어서 출력하라
		//dfs(0,0);
		makeCombinations(0, 0);
	}

}
