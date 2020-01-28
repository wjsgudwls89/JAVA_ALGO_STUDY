package algo_basic.day2;

public class ArrayTraversal {
	static int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String[] args) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[j].length; j++) {
				System.out.printf("%d ",nums[i][j]);
			}
			System.out.printf("\n");
		}
		
		for (int j = 0; j < nums[j].length; j++) {
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%d ",nums[i][j]);
			}
			System.out.printf("\n");
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[j].length; j++) {
				System.out.printf("%d ",nums[i][j + (nums[j].length-1 -2*j) * (i%2)]);
			}
			System.out.printf("\n");
		}
	}
	//각 요소를 기준으로 4방 탐색후 요소들의 합을 출력해보자.
	public static void dir4C() {
		
	}
}
