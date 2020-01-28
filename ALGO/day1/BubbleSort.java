package algo_basic.day1;

public class BubbleSort {
	public static void main(String[] args) {
		int[] data = {7,5,6,4,2,1,3,2};
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
					
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		
	}
}
