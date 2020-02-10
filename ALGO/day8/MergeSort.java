package algo_basic.day8;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {69,10,30,2,16,8,31,22};
		
		// mergesort를 이용해서 위 배열을 정렬 후 출력하시오
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void mergeSort(int [] arr,int si,int ei) {
		
		// 종료조건 크기가 1이면 더 이상 나눌 필요가 없다.
 		if(si == ei)return;
		//그렇지 않다면 반씩 나눠가며 재귀 호출
		int mi = (si+ei)/2;
		
		mergeSort(arr,si,mi);
		mergeSort(arr, mi+1, ei);
		//분할이 완료되면 --> 맨 아래 가지에서 만난 두재 귀의 결과에서 병함
		merge(arr, si, mi, ei);
		
	}
	public static void merge(int [] arr,int si,int mi,int ei) {
		//병합 정렬은 별도의 메모리 공간을 사용한다.
		int [] temp = new int[arr.length];
		int li = si;  //왼쪽배열의 시작점
		int ri = mi +1;//오른쪽 배열의 시작점.
		int ti = si; //결과를 저장할 임시 배열의 시작점.
		
		while(li <= mi && ri <= ei) { //양 부분에서 아직 처리할 데이터가 있다면....
			if(arr[li] <= arr[ri]) {
				temp[ti++] = arr[li++];
			}else {
				temp[ti++] = arr[ri++];
			}
			
		}
		// 한쪽에만 데이터가 남은 경우 - 남은 데이터 사용하기
		while(li<=mi) {
			temp[ti++] = arr[li++];
		}
		while(ri <= ei) {
			temp[ti++] = arr[ri++];
		}
		for (int i = si; i <= ei; i++) {
			arr[i] =temp[i];
		}
		
	}
}
