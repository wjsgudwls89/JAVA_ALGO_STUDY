package algo_basic.day9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApiTest {
	public static void main(String[] args) {
		useSet(new HashSet<>());
		useSet(new LinkedHashSet<>());
		useSet(new TreeSet<>());
	}
	public static void useSet(Set<String> set) {
		set.add("Hello");
		set.add("Hello"); //증복데이터가 허용되지 않음
						  //객체의 equals, hashcode 결과 확용
		set.addAll(Arrays.asList("Dreams","Come","My","True"));
		//출력순서가 보장되지 않음 = hashset
		//입력한 순서로 뺄 수 있따. = linkedhashset
		System.out.println(set.getClass().getName()+" : "+set);
		
		for (String str : set) {
			System.out.println("for : "+str);
		}
		//collection의 하위 클래스 이므로
		//size,isEmpty,add,contains.......
		
		//수정 - 불가능
		set.remove("Hello");
		System.out.println("삭제후 :"+set);
		
		if(set instanceof TreeSet) {
			TreeSet<String> tset = (TreeSet<String>)set;
			//treeset은 검색과 관련된 기능 제공
			System.out.println("test의 앞에 요소들"+tset.headSet("Test"));
			System.out.println("test의 뒤 요소들"+tset.tailSet("Test"));
			System.out.println("Dinner <=X < Test인 요소들?"+tset.subSet("Dinner","Test"));
			System.out.println(tset.first()+" : "+tset.pollFirst()+" : "+tset.pollLast());
		}
	}
}
