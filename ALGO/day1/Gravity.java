package algo_basic.day1;

public class Gravity {
	static int[] data = {7,4,2,0,0,6,0,7,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = i; j < data.length; j++) {
				int k = data[i] - data[j];
				if(k > max)
					max = k;
			}
		}
		System.out.println(max);
	}

}
