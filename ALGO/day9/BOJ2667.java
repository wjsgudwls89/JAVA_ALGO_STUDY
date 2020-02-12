package algo_basic.day9;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2667 {
	static int num;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static int[][] arr = new int[25][25];
	static int[][] visit = new int[25][25];
	static int cnt = 1;
	public static int bfs(int sy,int sx) {
		int sum = 1;
		Queue<Integer> xq = new LinkedList<>();
		Queue<Integer> yq = new LinkedList<>();
		
		xq.offer(sx);
		yq.offer(sy);
		
		visit[sy][sx] = cnt;
		
		while(!xq.isEmpty()) {
			int x = xq.peek();
			int y = yq.peek();
			xq.poll();yq.poll();
			for (int i = 0; i < 4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=0 && ny >=0 && nx< num && ny < num && arr[ny][nx] == 1 && visit[ny][nx] == 0) {
					visit[ny][nx] = cnt;
					sum++;
					xq.offer(nx);
					yq.offer(ny);
					
				}
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j) - '0';
				if(arr[i][j] == 0) {
					visit[i][j] = 9999;
				}
			}
		}
		List<Integer> ans = new LinkedList<>();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(arr[i][j] == 1 && visit[i][j] == 0) {
					ans.add(bfs(i,j));
				}
			
			}
		}
		
		System.out.println(ans.size());
		ans.sort(null);
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}

}
