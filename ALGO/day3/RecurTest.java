package algo_basic.day3;

import org.junit.jupiter.api.Test;

public class RecurTest {
	public static void main(String[] args) {
		//recur2(10);
		

	}
	public static void recur2(int k) {
		//두가지 케이스를 고려한다.
		//1.종료 조건 - base case
		if(k == 0) {
			System.out.println("재귀 종료");
			return;
		}
		else {
			//2. 그렇지 않으면 재귀 호출
			System.out.println("before : "+k);
			recur2(k-1); //종료 조건으로 수렴할것.
			System.out.println("after : "+ k);
		}
	}
	public void recur3(int k, int n, int arr[]) {
		if(k == n) {
			return;
		}
		arr[0] = k;
		System.out.println(k + ":" + (arr[0]));
		recur3(k+1,n,arr);
		arr[0] = k; // 여기서 재할당을 해줘야 함
		System.out.println(k + ":" + (arr[0]));
	}
	@Test
	public void recur3Test() {
		int[] arr = new int[1];
		recur3(0,3,arr);
	}
}
