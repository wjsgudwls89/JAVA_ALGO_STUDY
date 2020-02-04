package algo_basic.day7;

import java.util.Arrays;

public class PowersetSum {
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	static int[] visit = new int[arr.length];
	
	public static void dfs(int sum,int start) {
		if(sum>10) {
			//System.out.println(sum);
			//Print();
			return;
		}
		else if(sum == 10) {
			System.out.println(sum);
			Print();
			return;
		}
		else {
			for (int i = start; i < visit.length; i++) {
				if(visit[i] == 0) {
					visit[i] = 1;
					sum+=arr[i];
					dfs(sum,i+1);
					sum-=arr[i];
					visit[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(visit.length);
		dfs(0,0);
	}
	
	public static void Print() {
		for (int i = 0; i < arr.length; i++) {
			if(visit[i] == 1) {
				System.out.printf("%d ",arr[i]);
			}
			else continue;
		}
		System.out.println();
		//System.out.println(Arrays.toString(visit));
	}

}
