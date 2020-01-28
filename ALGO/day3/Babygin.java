package algo_basic.day3;

import java.util.Arrays;

public class Babygin {
	private static String[] data = {"667767","054060","101123","235777"};
	private static boolean[] visit = new boolean[6];
	static int run = 0;
	static int triplet = 0;
	static boolean flag = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i = 0; i < data.length; i++) {
		char[] arr = new char[6];
		flag = false;
		Permutation(0, i, arr);
		if(flag)System.out.println(data[i] + " is babygin");
		else System.out.println(data[i] + " is not babygin");
		
	}
	}
	public static void Permutation(int depth,int idx,char arr[]) {
		
		if(flag) {
			visit = new boolean[6];
			return;
		}
		
		if(depth == 6) {
			
			char[] temp1 = new char[3];
			char[] temp2 = new char[3];
			run = 0;triplet = 0;
			for (int i = 0; i < arr.length; i++) {
				if(i <= 2) temp1[i] = arr[i];
				else  temp2[i-3] = arr[i];
			}
			checkRun(temp1);checkRun(temp2);
			checkTrip(temp1);checkTrip(temp2);
			//System.out.println(run+" "+ triplet);
			if((run + triplet) == 2) flag = true;
			return;
		}
		else {
			for (int i = 0; i < data[idx].length(); i++) {
				if(!visit[i]) {
					visit[i] = true;
					arr[depth] = data[idx].charAt(i);
					Permutation(depth+1, idx, arr);
					visit[i] = false;
				}
			}
		}
	}
	public static void checkRun(char temp[]) {
		if(temp[1] - 1 == temp[0] && temp[1]+1 == temp[2])
			run++;
	}
	public static void checkTrip(char temp[]) {
		if(temp[1] == temp[0] && temp[1]== temp[2])
			triplet++;
	}

}
