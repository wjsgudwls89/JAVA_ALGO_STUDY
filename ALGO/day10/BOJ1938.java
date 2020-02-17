//package algo_basic.day10;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class BOJ1938 {
//	static int n;
//	static int map[][] = new int[50][50];
//	static int dx[] = {1,0,-1,0,1,1,-1,-1};
//	static int dy[] = {0,1,0,-1,-1,1,1,-1};
//	static Queue<wood> q = new LinkedList<>();
//	public static void DFS() {
//		
//		for (int i = 0; i < wset.size(); i++) {
//			
//		}
//	}
//	static List<wood> wsets = new ArrayList<>();
//	public static void U(List<wood> wset) {
//		int mny[] = new int[3];
//		for (int i = 0; i < wset.size(); i++) {
//			int nx = wset.get(i).x;
//			int ny = wset.get(i).y;
//			 ny --;
//			 mny[i] = ny;
//			if(ny < 0 || map[ny][nx] == 1) return;
//		}
//		for (int i = 0; i < wset.size(); i++) {
//			q.offer(new wood(mny[i],wset.get(i).x));
//		}
//		return;
//	}
//	public static void D() {
//		for (int i = 0; i < wset.size(); i++) {
//			int nx = wset.get(i).x;
//			int ny = wset.get(i).y;
//			 ny ++;
//			if(ny >= n || map[ny][nx] == 1) return;
//		}
//		for (int i = 0; i < wset.size(); i++) {
//			wset.get(i).y++;
//		}
//		return;
//	}
//	public static void L() {
//		for (int i = 0; i < wset.size(); i++) {
//			int nx = wset.get(i).x;
//			int ny = wset.get(i).y;
//			 nx--;
//			if(nx < 0 || map[ny][nx] == 1) return;
//		}
//		for (int i = 0; i < wset.size(); i++) {
//			wset.get(i).x--;
//		}
//		return;
//	}
//	public static void R() {
//		for (int i = 0; i < wset.size(); i++) {
//			int nx = wset.get(i).x;
//			int ny = wset.get(i).y;
//			 nx ++;
//			if(nx >= n || map[ny][nx] == 1) return;
//		}
//		for (int i = 0; i < wset.size(); i++) {
//			wset.get(i).x++;
//		}
//		return;
//	}
//	public static void T() {
//		boolean flag = false;
//		int x = wset.get(1).x;
//		int y = wset.get(1).y;
//		if(wset.get(0).x == wset.get(1).x && wset.get(1).x == wset.get(2).x) {
//			flag = true;
//		}
//		for (int i = 0; i < 8; i++) {
//			int nx = x+dx[i];
//			int ny = y+dy[i];
//			if(nx<0 || ny < 0 || nx>=n || ny>=n || map[ny][nx] == 1) return;
//		}
//		if(flag) {
//			wset.get(0).x = wset.get(1).x+1;
//			wset.get(0).y = wset.get(1).y;
//			wset.get(2).x = wset.get(1).x-1;
//			wset.get(2).y = wset.get(1).y;
//			int tempx = wset.get(0).x;
//			wset.get(0).x = wset.get(2).x;
//			wset.get(2).x = tempx;
//		
//		}
//		else {
//			wset.get(0).y = wset.get(1).y-1;
//			wset.get(0).x = wset.get(1).x;
//			wset.get(2).y = wset.get(1).y+1;
//			wset.get(2).x = wset.get(1).x;
//			int tempy = wset.get(0).y;
//			wset.get(0).y = wset.get(2).y;
//			wset.get(2).y = tempy;
//		}
//		return;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		n = sc.nextInt();
//		sc.nextLine();
//		for (int i = 0; i < n; i++) {
//			String str = sc.nextLine();
//			for (int j = 0; j < str.length(); j++) {
//				if(str.charAt(j) == 'B') { map[i][j] = 2;
//				wset.add(new wood(i,j));
//				}
//				else if(str.charAt(j) == 'E') map[i][j] = -1;
//				else
//					map[i][j] = str.charAt(j)-'0';
//			}
//			
//		}
//	}
//	static class wood{
//		int y;
//		int x;
//		public wood(int y, int x) {
//			super();
//			this.y = y;
//			this.x = x;
//		}
//		
//		
//	}
//
//}
