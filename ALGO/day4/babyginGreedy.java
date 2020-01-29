package algo_basic.day4;

import java.util.Arrays;

public class babyginGreedy {
	private static String[] data = {"667767","054060","444345","101123"};
	static int[] count;
	static int run;
	static int trip;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			count = new int[10];
			run = 0;
			trip  = 0;
			for (int j = 0; j < data[i].length(); j++) {
				count[data[i].charAt(j) - 48]++;
				
			}
			checkRun(count);checkTrip(count);
			if(run ==2 || trip ==2 || (run ==1 && trip ==1))
			System.out.println(data[i] + " is babygin"); 
		}
	}
	public static void checkRun(int[] count) {
		for (int i = 0; i < count.length-2; i++) {
			if(count[i] != 0) {
				if((count[i] != 0 && count[i+1] != 0) && (count[i] != 0 && count[i+2]!=0)){
					run++;
					count[i] --; count[i+1]--; count[i+2]--;
				}
			}
		}
	}
	public static void checkTrip(int[] count) {
		//System.out.println(Arrays.toString(count));
		for (int i = 0; i < count.length; i++) {
			if(count[i] >= 3) {
				count[i]-=3;
				trip++;
			}
		}
	}

}
