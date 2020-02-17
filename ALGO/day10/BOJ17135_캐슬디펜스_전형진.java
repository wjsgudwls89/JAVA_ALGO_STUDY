package algo_basic.day10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ17135_캐슬디펜스_전형진 {
	
	static int map[][] = new int[16][16];
	static int visit[] = new int[16];
	static List<enemy> en = new ArrayList<>();
	static List<enemy> temp;
	static List<enemy>[] die = new List[3];
	static int n,m,d;
	static int ans = 0;
	static int rans = 0;

	public static void kill() {
		List<hunter> hu = new ArrayList<>();
		int rmax = 0;
		die[0] = new ArrayList<>();
		die[1] = new ArrayList<>();
		die[2] = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if(visit[i] == 1) {
				hu.add(new hunter(i,n));
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < temp.size(); j++) {
				if(Math.abs(hu.get(0).y - temp.get(j).y) + Math.abs(hu.get(0).x - temp.get(j).x) <=d) {
					int dis = Math.abs(hu.get(0).y - temp.get(j).y) + Math.abs(hu.get(0).x - temp.get(j).x);
					die[0].add(new enemy(temp.get(j).y,temp.get(j).x,dis,j));
				}
				if(Math.abs(hu.get(1).y - temp.get(j).y) + Math.abs(hu.get(1).x - temp.get(j).x) <=d) {
					int dis = Math.abs(hu.get(1).y - temp.get(j).y) + Math.abs(hu.get(1).x - temp.get(j).x);
					die[1].add(new enemy(temp.get(j).y,temp.get(j).x,dis,j));
					
				}
				if(Math.abs(hu.get(2).y - temp.get(j).y) + Math.abs(hu.get(2).x - temp.get(j).x) <=d) {
					int dis = Math.abs(hu.get(2).y - temp.get(j).y) + Math.abs(hu.get(2).x - temp.get(j).x);
					die[2].add(new enemy(temp.get(j).y,temp.get(j).x,dis,j));
				}
			}
			
			for (int k = 0; k < 3; k++) {
				if(die[k].size()>1) {
					
					die[k].sort(new Comparator<enemy>() {
						
						@Override
						public int compare(enemy o1, enemy o2) {
							if(o1.dis < o2.dis) {
								return -1;
							}
							else if(o1.dis == o2.dis) {
								if(o1.x < o2.x) {
									return -1;
								}
								else return 1;
							}
							else
								return 1;
						}
					});
					
					if(temp.get(die[k].get(0).idx).y == 9999) {
						rmax --;
					}
					else 
						temp.get(die[k].get(0).idx).y = 9999;
					rmax++;
					die[k].clear();
				} else if(die[k].size() == 1) {
					if(temp.get(die[k].get(0).idx).y == 9999) {
						rmax--;
					}else 
						temp.get(die[k].get(0).idx).y = 9999;
						
					rmax++;
					die[k].clear();
				}
			}
			
			hu.get(0).y--;
			hu.get(1).y--;
			hu.get(2).y--;
			
			for (int ab = 0; ab < temp.size(); ab++) {
				if(temp.get(ab).y == hu.get(0).y) {
					temp.get(ab).y = 9999;
				}
			}
		}
		hu.clear();
		//System.out.println(rmax);
		ans = Math.max(ans,rmax);
		return;
	}
	public static void DFS(int start,int depth) {
		if(depth == 3) {
			temp = new ArrayList<>();
			for (int i = 0; i < en.size(); i++) {
				temp.add(new enemy(en.get(i).y,en.get(i).x));
			}
			kill();
			return;
		}
		for (int i = start; i < m; i++) {
			if(visit[i] == 0) {
				visit[i] = 1;
				DFS(i+1,depth+1);
				visit[i] = 0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) {
					en.add(new enemy(i,j));
				}
			}
		}
		DFS(0,0);
		System.out.println(ans);
	}
	static class enemy{
		int x;
		int y;
		int dis;
		int idx;
		boolean die =false;
		
		public enemy(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public enemy(int y, int x,int dis) {
			super();
			this.y = y;
			this.x = x;
			this.dis = dis;
			
		}
		public enemy(int y, int x,int dis,int idx) {
			super();
			this.y = y;
			this.x = x;
			this.dis = dis;
			this.idx = idx;
			
		}
		@Override
		public String toString() {
			return x+" " + dis;
		}
	
	}
	static class hunter{
		int x;
		int y;
		public hunter(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
}