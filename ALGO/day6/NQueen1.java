package algo_basic.day6;

import java.util.Arrays;

public class NQueen1 {
	private static int size = 4;
	private static int [][] map = new int[size][size];
	private static int cnt;
	private static void dfs(int row) {
		if(row == size){
			System.out.println("맨마지막 결과 출력"+ ++cnt);
			if(isPromising()) {
				for(int [] rowarr:map) {
					System.out.println(Arrays.toString(rowarr));
				}
				
			}
			return;
		}
		else {
			for (int i = 0; i < 4; i++) {
				if(map[row][i] ==0) {
					map[row][i] = 1;
					dfs(row+1);
					map[row][i] = 0;
				}
			}
		}
	}
	//맨마지막꽈지 독ㄹ을왔으니까 이 행동이 적합했는지 생각해보장
	private static boolean isPromising() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j] == 1) {
					//내 왼쪽에 누가없나?
					for (int k = 0; k < j; k++) {
						if(map[i][k] == 1) return false;
					}
					for (int k = 1; k <= i; k++) {
						if(map[i-k][j] == 1) return false;//위로
						if(j-k>=0 && map[i-k][j-k] == 1) return false;//왼쪽대각선
						if(j+k<size && map[i-k][j+k] == 1) return false;//오른쪽대각선
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		dfs(0);
	}
}
