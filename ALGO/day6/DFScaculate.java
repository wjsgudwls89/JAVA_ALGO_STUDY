package algo_basic.day6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DFScaculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String src = sc.nextLine();
		char[] c = new char[src.length()];
		Stack<Character> s = new Stack<>();
		int idx = 0;
		for (int i = 0; i < src.length(); i++) {
			char str= src.charAt(i);
			int order = getPriority(str);
			//if(str - '0' > 0) {c[idx] = str; idx++; System.out.println(str-'0');}
			if(order == 0) {
				c[idx] = src.charAt(i);
				idx++;
			}
			else if(order == 2) { //  여는괄호 무조건 푸쉬
				s.push(str);
			}
			else if(order == 1) { //  닫는괄호는 여는 괄호를 만날때까지 pop하고 더해주기
				while(true) {
					char top = s.pop();
					if(top == '(') { 
						break;
					}
					else {
						c[idx] = top;
						idx++;
					}
				}
			}
			else {
				while(true) {
					if(s.isEmpty()) {break;}
					char top = s.peek();
					if(getPriority(top) >= order) {
						s.pop();
						c[idx] = top;
						idx++;
					}
					else {break;}
				}
				//원탑의 조건이 완성되었으므로 내가들ㅇㅓ갈게
				s.push(str);
			}
//			if(src.charAt(i)-'0' > 0) {
//				System.out.println(src.charAt(i) - '0');
//				c[idx] = src.charAt(i);
//				idx++;
//			}
//			else {
//				int p = getPriority(src.charAt(i));
//				if(s.isEmpty()) s.push(src.charAt(i));
//				else {
//					int k = getPriority((char) s.peek());
//					if(p < k) {s.push(src.charAt(i));System.out.print(s);}
//					else {char cc = (char) s.pop();
//						System.out.println(cc);
//					}
//				}
//			}
		}
		//System.out.println(s);
		while(!s.empty()) {
			c[idx] = s.pop();
			idx++;
		}
		System.out.println(Arrays.toString(c));
		Stack<Integer> cal = new Stack<>();
		
		for (int i = 0; i < idx; i++) {
			if(c[i] - '0' > 0) {
				
				cal.push((int)(c[i]-'0'));
			}
			else {
				int a= cal.pop();
				int b= cal.pop();
				if(c[i] == '*') {cal.push(b * a);}
				else if(c[i] == '/'){
					
					 cal.push(b/a);}
				else if(c[i] == '-'){cal.push(b-a);}
				else if(c[i] == '+'){cal.push(b+a);}
			}
		
		}
		System.out.println(cal.peek());
	}
	public static int getPriority(char data) {
		if(data == '-' || data == '+') return 3;

		else if(data == '*' || data == '/') return 4;

		else if( data == '(') return 2;
		else if(data == ')')  return 1;
		else return 0;
	}

}
