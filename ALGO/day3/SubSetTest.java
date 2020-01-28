package algo_basic.day3;

import java.util.ArrayList;
import java.util.List;

public class SubSetTest {
	static char[] chars = {'A','B','C','D'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("개수" + (1<<chars.length));
		for (int i = 0; i <(1 << chars.length); i++) {
			System.out.println(Integer.toBinaryString(i));
			List<Character> subst = new ArrayList<>();
			for (int j = 0; j < chars.length; j++) {
				if((i & 1<<j) > 0 ) { //포함된원소
					subst.add(chars[j]);
					
				}
			}
			System.out.println(subst);
		}
	}

}
