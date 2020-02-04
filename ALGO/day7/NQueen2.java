package algo_basic.day7;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen2 {

	private static int size;
	private static int [][] map;
	private static int cnt;
	private static void dfs(int row) {
		if(row == size){
			cnt++;
			return;
		}
		else {
			for (int i = 0; i < size; i++) {
				if(map[row][i] ==0) {
					map[row][i] = 1;
					if(isPromising(row +1)) {
					dfs(row+1);
					}
					map[row][i] = 0;
				}
			}
		}
	}
	//맨마지막꽈지 독ㄹ을왔으니까 이 행동이 적합했는지 생각해보장
	private static boolean isPromising(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(map[i][j] == 1) {
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
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		map = new int[size][size];
		dfs(0);
		System.out.println(cnt);
	}
}
