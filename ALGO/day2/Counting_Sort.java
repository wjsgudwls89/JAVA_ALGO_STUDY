package algo_basic.day2;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,4,1,3,1,2,4,1};
		
		
		int k = 0;
		
		for (int i = 0; i < A.length; i++) {
			k = Math.max(k, A[i]);
		}
		
		int[] counts = new int[k+1];
		
		for (int i = 0; i < A.length; i++) {
			counts[A[i]]++;
		}
		
		for (int i = 0; i < counts.length-1; i++) {
			counts[i+1] = counts[i] + counts[i+1];
		}
		int[] temp = new int[A.length];
		
		for (int i = A.length-1; i >= 0; i--) {
			int num = A[i];
			int idx = counts[num]-1;
			temp[idx] = num;
			counts[num]--;
		}
		System.out.println(Arrays.toString(temp));
	}
}
