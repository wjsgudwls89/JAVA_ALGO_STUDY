package algo_basic.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListVSLinked {

	public static void addSequencial(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000*2; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" : "+(end- start));
	}
	public static void addNonSequencial(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000*2; i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" : "+(end- start));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		addSequencial(new LinkedList<Integer>());
//		addSequencial(new ArrayList<Integer>());
		addNonSequencial(new LinkedList<>());
		addNonSequencial(new ArrayList<>());
		
	}

}
