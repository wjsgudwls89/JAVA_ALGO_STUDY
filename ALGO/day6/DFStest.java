package algo_basic.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DFStest {
	static Stack<Integer> s;
	static List<Integer>[] graph = new List[7+1];
	static int[] visit = new int[7+1];
	static ArrayList<Integer> path = new ArrayList<>();
	static String src = "1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7";
	public static void DFSrecur(int start) {
		if(visit[start] == 0) {
			visit[start] = 1;
			path.add(start);
		}
		List<Integer> childs = graph[start];
		
		for (int i = 0; i < childs.size(); i++) {
			int child = childs.get(i);
			if(visit[child] == 0) {
				DFSrecur(child);
			}
		}
		
	}	
	public static void DFSstack(int start) {
		 s = new Stack<>();
		 path = new ArrayList<>();
		 s.push(start);
		 
		 while(!s.isEmpty()) {
			 Integer top = s.pop();
			 
			 if(visit[top] == 1){
				 continue;
			 }
			 visit[top] = 1;
			 path.add(top);
			 List<Integer> childs = graph[top];
			 int ss = childs.size();
			 
			 for (int i = ss-1; i >=0; i--) {
				Integer child = childs.get(i);
				if(visit[child] == 0) {
					s.push(child);
				}
			}
		 }
		 System.out.println(path);
		System.out.println(Arrays.toString(visit));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int V = 7+1;
		
		
		
		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}
		String[] splited = src.split(" ");
		
		for (int i = 0; i < splited.length; i+=2) {
			int a = Integer.parseInt(splited[i]);
			int b = Integer.parseInt(splited[i+1]);
			graph[a].add(b);
			graph[b].add(a);
		}
		for (int i = 0; i < graph.length; i++) {
			System.out.println(graph[i]);
		}
		//DFSstack(1);
		DFSrecur(1);
		System.out.println(path);
	}

}
