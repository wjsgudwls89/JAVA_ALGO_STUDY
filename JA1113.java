package com.ssafy.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JA1113 {
	static int[][] map;
	static int[][] visit;
	static int ay;
	static int ax;
	static int r;
	static int c;
	static int corner = Integer.MAX_VALUE;
	static int min = Integer.MAX_VALUE;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static List<Integer> ans = new ArrayList<>();
	
	public static void DFS(int depth,int y,int x,int dir,int prev,int cn) {
		if(depth == 1) prev= dir;
		if(min<depth) return;
		
		if(prev != dir) { cn++; prev = dir;}
		
		
		if(y == ay && x == ax) {
			if(min>=depth) {
				min = depth;
				if(corner > cn)
					corner = cn;
			}			
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx >= 0 && ny >=0 && nx<c && ny <r && map[ny][nx] == 1) {
				if(visit[ny][nx] == 0) {
					visit[ny][nx] = 1;
					DFS(depth+1,ny,nx,i,prev,cn);
					visit[ny][nx] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		c = sc.nextInt();
		map = new int[r][c];
		visit = new int[r][c];
		
		ay = sc.nextInt();
		ax = sc.nextInt();
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		DFS(0,0,0,0,0,0);
		for (int i = 0; i < r; i++) {
			System.out.println(Arrays.toString(visit[i]));
		}
		System.out.println(corner);
	}

}
