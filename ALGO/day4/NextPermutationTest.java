package algo_basic.day4;

import java.lang.reflect.*;
import java.util.Arrays;

public class NextPermutationTest {
	private static int[] src = {1,2,4,3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(nextPermutation());
		Arrays.sort(src);
		do {
			System.out.println(Arrays.toString(src));
		} while (nextPermutation());
	}
	private static boolean nextPermutation() {
		// step 1: src[i] < src[i+1] 인 가장뒤의 요소를 찾음
		int i;
		for (i = src.length-2; i >= 0; i--) {
			if(src[i] < src[i+1]) {
				//System.out.println("발견!: " + i);
				break;
			}
		}
		//여기까지 왔는데 i가 음수라면? --> 교환대상이 없다 --> 다음 순열도 없다.
		if(i < 0) {
			return false;
		}
		int j;
		for (j = src.length-1; j >i; j--) {
			if(src[i] < src[j]) {
				//System.out.println(j); 
				break;}
			}
		int temp = src[i];
		src[i] = src[j];
		src[j] = temp;
		
		//i 증가 j감소 시키면서 서로 바꿔준다. ( i의 뒤에 있는 것들 reverse)
		for (int k = i+1,b =src.length-1; k<b; k++,b--) {
			temp  = src[k];
			src[k] = src[b];
			src[b] = temp;
		}
		//System.out.println(Arrays.toString(src));
		return true;
	}
}
