package algo_basic.day7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length()) return -1;
				else if(o1.length() == o2.length()) {
					char a = o1.charAt(0);
					char c = o2.charAt(0);
					
					if( a> c) return -1;
					else return 1;
				}
				else return 1;
			}
		});
		pq.offer("true");
		pq.offer("dream");
		pq.offer("is");
		pq.offer("come");
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
			}
	}

}
