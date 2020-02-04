package algo_basic.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFStest {
	static String data = "1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7";
	static List<Integer>[] graph = new List[7+1];
	static int visit[] = new int[7+1];
	static int cnt = 0;
	public static void BFS(int start) {

		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = 1;
		
		while(!q.isEmpty()) {
			
			int qs = q.size();
			
			while(qs>0) {
				int x = q.peek();
				if(x == 6) return;
				q.poll();

				for (int i = 0; i < graph[x].size(); i++) {
					int nx = graph[x].get(i);

					if(visit[nx] == 0) {
						visit[nx] = 1;
						q.add(nx);
						
					}
				}
				qs--;
			}
			cnt++;
			
		}
	}
	public static void main(String[] args) {
		String[] splited = data.split(" ");
		for (int i = 0; i < 8; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < splited.length; i+=2) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);

			graph[a].add(b);
			//graph[b].add(a);
		}
		BFS(1);
		System.out.println(cnt);
	}
}
