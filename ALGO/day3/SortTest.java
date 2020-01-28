package algo_basic.day3;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {"dream","is","come","true"};
		Arrays.sort(strs,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()<o2.length()) {
					return -1;
					
				}
				else if(o1.length() == o2.length()) {
					return -1;
					
				}
				else {
				return 1;
				}
			}
		});
		System.out.println(Arrays.toString(strs));
	}

}
