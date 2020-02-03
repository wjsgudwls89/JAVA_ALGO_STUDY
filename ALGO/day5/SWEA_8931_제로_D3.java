package algo_basic.day5;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_8931_제로_D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tc= sc.nextInt();
		for (int t = 0; t < tc; t++) {
			int k = sc.nextInt();
			Stack s = new Stack<>();
			for (int i = 0; i < k; i++) {
				int num = sc.nextInt();
				if(num == 0) {
					s.pop();
				}else {
				s.push(num);
				
				}
				
			}
			int sum = 0;
			int ss = s.size();
			for (int i = 0; i < ss; i++) {
				sum+=(int)s.peek();
				s.pop();
			}
			System.out.println("#"+(t+1)+" "+sum);
		}
		
	}

}
