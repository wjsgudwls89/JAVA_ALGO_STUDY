package algo_basic.day9;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2606 {
	static int num;
	static int m;
	static int[] visit = new int[101];
	static List<Integer>[] com = new List[100+1];
	public static int BFS(int start) {
		int cnt = 0;
		Queue<Integer> q= new LinkedList<>();
		q.offer(start);
		visit[start] = 1;
		
		while(!q.isEmpty()) {
			int x = q.peek();
			q.poll();
			for (int i = 0; i < com[x].size(); i++) {
				int nx = com[x].get(i);
				
				if(visit[nx] == 0) {
					q.offer(nx);
					visit[nx] = 1;
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			com[i] = new LinkedList<>();
		}
		m = sc.nextInt();
		for (int i = 0; i <m; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			com[a].add(b);
			com[b].add(a);
		}
		System.out.println(BFS(1));
	}

}
