package algo_basic.day7;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApi {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(100);
		queue.add(100);
		System.out.println(queue);
		
		System.out.println(queue.peek()+" :" +queue.size());
		System.out.println(queue.element()+" :"+queue.size());
		
		System.out.println(queue.poll()+" :"+queue.size());
		System.out.println(queue.remove()+" :"+queue.size());
	}
}
