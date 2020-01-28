package algo_basic.day2;

import java.util.Arrays;
import java.util.Random;

public class exercise1 {
	static int [][] nums = new int[5][5];
	public static void main(String[] args) {
		Random random = new Random();
		// TODO Auto-generated method stub
		
		
		int newarr[][] = new int[nums.length][nums[0].length];
	
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				//nums[i][j] = random.nextInt(25);
				nums[i][j] = (int) (Math.random() * 25);
			}
		}
//		int dx[] = {1,0,-1,0};
//		int dy[] = {0,1,0,-1};
//		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[0].length; j++) {
//				int sum = 0;
//				for (int k = 0; k < 4; k++) {
//					int nx = j +dx[k];
//					int ny = i+ dy[k];
//					
//					if(ny < nums.length && nx < nums[0].length && ny >=0 && nx >=0) {
//						sum += Math.abs(nums[i][j] - nums[ny][nx] );
//						newarr[i][j] = sum;
//					}
//				}
//				
//			}
//		}

//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(Arrays.toString(nums[i]));
//		}
//		System.out.println("-------------------------------------");
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(Arrays.toString(newarr[i]));
//		}
		/* 전치 행렬로 바꿔보기*/
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				if(i < j) {
					int temp = nums[i][j];
					nums[i][j] = nums[j][i];
					nums[j][i] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}

}
