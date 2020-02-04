package algo_basic.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class myChu {
	static int hnum = 1;
	static int cnt = 20;
	static int candynum = 20;
	static int mmy = 1;
	static int candy = 0;
	static Queue<PERSON> q = new LinkedList<>();
	static class PERSON{
		int num;
		int my;
		public PERSON(int num, int my) {
			super();
			this.num = num;
			this.my = my;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		q.add(new PERSON(hnum,mmy));
		while(cnt>=0) {
			String k = sc.nextLine();
			String str="1";
			if(str=="1") {check();}
		}
	}

	public static void check() {
		cnt -= q.peek().my;
		candy+=q.peek().my;
		if(candy>candynum) {
			candy = candynum;
		}
		System.out.println("큐에있는 사람수: "+q.size());
		System.out.println("일인당 나눠주는 사탕의 수: "+q.peek().my);
		System.out.println("나눠준 사탕수: "+candy);
		if(cnt<=0) { 
			cnt+=q.peek().my;
			System.out.println("가져가는사람: "+q.peek().num + " 가져간 갯수: " +cnt);

		}
		q.add(new PERSON(q.peek().num,q.peek().my+=1));
		q.poll();
		q.add(new PERSON(hnum+=1,mmy));

	}

}
