package algo_basic.day8;

import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {
	private static int n = 24;
	private static int k = 3;
	static class Solder{
		int idx;

		public Solder(int idx) {
			super();
			this.idx = idx;
		}
		
	}
	public static void main(String[] args) {
		Queue<Solder> arr = new LinkedList<>();
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			arr.offer(new Solder (i));
		}
		arr.poll();
		while(arr.size()>2) {
			for (int i = 0; i < k-1; i++) {
				arr.offer(arr.poll());
			}
			arr.poll();
		}
		while(!arr.isEmpty()) {
			Solder solder = arr.poll();
			System.out.println(solder.idx);
		}
		
	}

}
