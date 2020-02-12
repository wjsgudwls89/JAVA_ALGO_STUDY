package algo_basic.day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BOJ11724 {
	static int n;
	static int m;
	static int[] visit = new int[1001];
	static List<Integer>[] list = new List[1001];
	public static void BFS(int start) {
		Queue<Integer> q= new LinkedList<>();
		q.offer(start);
		visit[start] = 1;
		
		while(!q.isEmpty()) {
			int x= q.peek();
			q.poll();
			
			for (int i = 0; i < list[x].size(); i++) {
				int nx = list[x].get(i);
				if(visit[nx] == 0) {
					visit[nx] = 1;
					q.offer(nx);
				}
			}
		}
		q.clear();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		int cnt = 0;
		
		for (int i = 1;i <= n; i++) {
			if(visit[i] == 0) {
				BFS(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
