package algo_basic.day2;

import java.util.Arrays;

public class DirTraversal {
	static int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newarr[][] = new int[nums.length][nums[0].length];
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < 4; k++) {
					int nx = j +dx[k];
					int ny = i+ dy[k];
					
					if(ny < nums.length && nx < nums[0].length && ny >=0 && nx >=0) {
						sum += Math.abs(nums[i][j] - nums[ny][nx] );
						newarr[i][j] = sum;
					}
				}
				
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(newarr[i]));
		}
//	}
//	int newarr[][] = new int[nums.length][nums[0].length];
//	int dx[] = {1,-1,-1,1};
//	int dy[] = {1,1,-1,-1};
//	
//	for (int i = 0; i < nums.length; i++) {
//		for (int j = 0; j < nums[0].length; j++) {
//			int sum = 0;
//			for (int k = 0; k < 4; k++) {
//				int nx = j +dx[k];
//				int ny = i+ dy[k];
//				
//				if(ny < nums.length && nx < nums[0].length && ny >=0 && nx >=0) {
//					//sum += Math.abs(nums[i][j] - nums[ny][nx] );
//					sum+=nums[ny][nx];
//				}
//			}
//			newarr[i][j] = sum;
//		}
//	}
//	for (int i = 0; i < nums.length; i++) {
//		System.out.println(Arrays.toString(newarr[i]));
//	}
}
}
