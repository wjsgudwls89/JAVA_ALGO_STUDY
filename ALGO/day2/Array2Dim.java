package algo_basic.day2;

import java.util.Arrays;
import java.util.Comparator;

public class Array2Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int [] arr1;
		int [][] arr2 = new int[2][4];
		arr2[1][3] = 100;
		System.out.println(arr2[1][3]);
		
		
		
		Arrays.sort(arr2, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				Integer a = 0,b = 0;
				for (int i = 0; i < o1.length; i++) {
					a+=o1[i];
				}
				for (int i = 0; i < o2.length; i++) {
					b+=o2[i];
				}
				
				return a.compareTo(b)*-1;
			}

			
			
		});
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
	}

}
