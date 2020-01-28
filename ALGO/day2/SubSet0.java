package algo_basic.day2;

import java.util.Arrays;

public class SubSet0 {
	static int [] nums = {1,2};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] temp =new int[nums.length];
		int th = 0;
		for (int i = 0; i < 2; i++) {
			temp[0] = i%2;
			for (int j = 0; j < 2; j++) {
				temp[1] = j%2;
				System.out.println(++th+" : "+Arrays.toString(temp));
			}
		}
	}

}
