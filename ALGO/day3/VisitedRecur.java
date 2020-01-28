package algo_basic.day3;

import java.util.Arrays;

public class VisitedRecur {
	static char[] src = {'A','B','C','D'};
	static char[] temp = new char[3];
	static boolean[] visit = new boolean[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		Permutation(0, 3);

	}
	//src 원소 n개에서 r개를 구하는 순열을 모두 찾아보자
	//r:뽑을 갯수
	//temp = 모은녀석들
	//depth = 현재 선택된 요소의 temp에서의 idx
	//visit 방문여부를 저장해놓을 배열
	public static void Permutation(int depth,int r) {
		if(depth == r) {
			//완료 상태 -- > temp 출력
			System.out.println(Arrays.toString(temp));
			return;
		}
		else {
			//가능한 녀석들 다 대 보기
			for (int i = 0; i < visit.length; i++) {
				//마냥 쓸 수는 없고 아직 사용 전이지 확인 필요
				if(!visit[i]) {
					//미사용이-->제 쓸수 있어요
					visit[i] = true;//방문처리
					temp[depth] = src[i];
					Permutation(depth+1,r);
					visit[i] = false; //원상복귀
				}
			}
		}
	}

}
