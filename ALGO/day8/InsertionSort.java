package algo_basic.day8;

import java.util.Arrays;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		int [] arr = {3,5,4,10,6,8,1,2,7,9};
		System.out.println("hi");
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for (j = i-1; j >=0; j--) {
				if(arr[j] > key) {
					arr[j+1] = arr[j];
				}else
					break;
			}
			arr[j+1] = key;
		}
			System.out.println(Arrays.toString(arr));
	}
}
