package algo_basic.day7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest2 {
	private static String src = "1 2 2 1 5 7 2 5 5 5 4 7 2 4 4 4 3 1 4 6 3 2 3 2";
	static class set{
		int y;
		int x;
		int w;
		
		public set(int y, int x, int w) {
			super();
			this.y = y;
			this.x = x;
			this.w = w;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<set> pq = new PriorityQueue<>(new Comparator<set>() {

			@Override
			public int compare(set o1, set o2) {
				if(o1.w > o2.w) {return -1;}
				else if(o1.w == o2.w) {
					int a = o1.y;
					int b = o2.y;
					if(a>b) return 1;
					else return -1;
				}
				else {return 1;}
				
			}
		});
		String splited[] = src.split(" ");
		int[] arr = new int[splited.length];
		for (int i = 0; i < splited.length; i+=3) {
			pq.offer(new set(Integer.parseInt(splited[i]),Integer.parseInt(splited[i+1]),Integer.parseInt(splited[i+2])));
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().y+" "+pq.peek().x+" "+pq.peek().w);
			pq.poll();
		}
	}
		
		

}
