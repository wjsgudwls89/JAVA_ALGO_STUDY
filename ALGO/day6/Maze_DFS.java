package algo_basic.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Maze_DFS {
	private static int [][] map = {
			{0,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,0,1,1,1,1},
			{1,1,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,0}
	};
	private static boolean[][] visit = new boolean[8][8];
	private static int R=8,C= 8;
	private static int[] dx= {1,0,-1,0};
	private static int[] dy = {0,1,0,-1};
	
	static class Point{
		int r, c;

		@Override
		public String toString() {
			return "Point [r=" + r + ", c=" + c + "]\n";
		}

		public Point(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
		
	}
	static List<Point> path = new ArrayList<>();
	public static void DFS() {
		//탐색 시작점
		Point start = new Point(0,0);
		Stack<Point> stack = new Stack<>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			int y = stack.peek().r;
			int x = stack.peek().c;
			stack.pop();
			if( y == 7 && x == 7) { System.out.println("find");return;}
			visit[y][x] = true;
			for (int i = 0; i < 4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0 || ny <0 || nx>=R || ny>=R) continue;
				
				if(map[ny][nx] == 0 && !visit[ny][nx]) {
					Point newStart = new Point(ny,nx);
					visit[ny][nx] = true;
					path.add(newStart);
					stack.push(newStart);
					DFS();
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int [] row: map) {
			System.out.println(Arrays.toString(row));
		}
		DFS();
		System.out.println(path );
	}

}
