package algo_basic.day3;

public class SubSetSum {
	static int[] arr = {-7,-3,-2,5,8};
	static int[] visit;
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (i = 1; i <= arr.length; i++) {
			visit  = new int[arr.length];
			dfs(0,0,0);
		}
	}
	public static void dfs(int start,int sum, int depth) {		
			
		if(depth == i &&sum == 0) {
			System.out.println("yes");
			return;
		}
		for (int k = start; k < visit.length; k++) {
			if(visit[k] == 0) {
				visit[k] = 1;
				dfs(k+1,sum+=arr[k],depth+1);
				sum-=arr[k];
				visit[k] = 0;
				
			}
		}
	}

}
