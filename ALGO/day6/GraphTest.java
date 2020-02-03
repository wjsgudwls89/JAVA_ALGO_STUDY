package algo_basic.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphTest {
	
	private static int v =7;
	private static String src = "1 2 1 3 1 6 1 7 6 4 6 5 5 4 7 5";

	public static void makeGraph1() {
		// TODO Auto-generated method stub
		int[][] graph = new int[8][8];
		
		String [] splited = src.split(" ");
		
		for (int i = 0; i < splited.length; i+=2) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);
			
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		for (int i = 0; i < graph.length; i++) {
			System.out.println(Arrays.toString(graph[i]));
		}
	}
	public static void makeGraph2() {
		// TODO Auto-generated method stub
		int[][] graph = new int[8][8];
		src = "1 2 2 1 5 7 2 5 5 5 4 7 2 4 4 2 4 4 4 3 1 4 6 3 2 3 2";
		String [] splited = src.split(" ");
		
		for (int i = 0; i < splited.length; i+=3) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);
			int c = Integer.parseInt(splited[i+2]); // 가중치 더해주기
			
			graph[a][b] = c;
			
		}
		
		for (int i = 0; i < graph.length; i++) {
			System.out.println(Arrays.toString(graph[i]));
		}
	}
	public static void makeGraph4() {
		// TODO Auto-generated method stub
		src = "1 2 1 3 1 6 1 7 6 4 6 5 5 4 7 5";
		List<Integer>[] graph = new List[7+1];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		String[] splited = src.split(" ");
		
		for (int i = 0; i < splited.length; i+=2) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);
			graph[a].add(b);
			//방향성을 봐주려면 밑에것을 없애주면됨 push_back과 비슷한 원리
			graph[b].add(a);
		}
		for(List<Integer> list:graph) {
			System.out.println(list);
		}
	
	}
	public static void makeGraph6() {
		// TODO Auto-generated method stub
		src = "1 2 2 1 3 4 1 6 1 1 7 3 6 4 6 6 5 1 5 4 2 7 5 4";
		List<Point>[] graph = new List[7+1];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		String[] splited = src.split(" ");
		
		for (int i = 0; i < splited.length; i+=3) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);
			int w = Integer.parseInt(splited[i+2]);
			graph[a].add(new Point(b,w)); // push_back({b,w}) 와 똑같음
			
			
		}
		for(List<Point> list:graph) {
			System.out.println(list);
		}
	
	}
	// 정점과 가중치 정보를 저장할 사용자 정의 클래스 struct
	static class Point{
		@Override
		public String toString() {
			return "[vId=" + vId + ", weight=" + weight + "]";
		}
		int vId;
		int weight;
		public Point(int vId, int weight) {
			super();
			this.vId = vId;
			this.weight = weight;
		}
		
	}
	
	public static void main(String[] args) {
		//makeGraph1();
		//makeGraph2();
		//makeGraph4();
		//makeGraph6();
	}
	

}
