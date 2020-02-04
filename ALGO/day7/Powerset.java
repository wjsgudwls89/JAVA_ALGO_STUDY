package algo_basic.day7;

import java.util.Arrays;

public class Powerset {
	static char[] src = {'A','B','C'};
	
	static boolean[] childs = {true,false};
	static boolean[] subset = new boolean[src.length];
	public static void dfs(int k,int input) {
	
		if(k == input) {
			Print();
			return;
		}
		for (int i = 0; i < childs.length; i++) {
			subset[k] = childs[i];
			dfs(k+1,input);
		}
		
	}
	
	public static void main(String[] args) {
		dfs(0,src.length);
	}
	public static void Print() {
		for (int i = 0; i < src.length; i++) {
			if(subset[i]) {
				System.out.print(src[i]);
			}
			
			else {
				continue;
			}
			
		}
		System.out.println();
	}
}
