package algo_basic.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListApiTest {
	static List<Integer> list = new ArrayList<>();
	public static void addTest() {
		list.add(100);
		list.add(200);
		list.add(0,10);
		list.add(1,200);
		System.out.println(list);
	}
	public static void selectTest() {
		System.out.println(list.size());
		System.out.println(list.contains(100));
		System.out.println(list.indexOf(100));
		System.out.println(list.isEmpty());
		Object [] arr = list.toArray();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+": "+list.get(i));
		}
		for (int data : list) {
			System.out.println(data);
		}
	}
	public static void removeTest() {
		list.addAll(Arrays.asList(1,2,3,4,5,6,7));
		
		Integer num = 1;
		int i = num;
		System.out.println("삭제전 :" + list);
		list.remove(1); //1번 index의 자료 삭제
		System.out.println("삭제 후:" + list);
		
		for (int j = 0; j < list.size(); j++) {
			list.remove(j);
			--j;
		}
		System.out.println("전체삭제 후:" + list);
	}
	
	public static void updateTest() {
		list.set(0, -1);
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTest();
		selectTest();
		removeTest();
		updateTest();
	}

}
