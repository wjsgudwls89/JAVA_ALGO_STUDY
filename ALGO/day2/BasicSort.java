package algo_basic.day2;

import java.util.Arrays;
import java.util.Comparator;

public class BasicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A = {0,4,1,3,1,2,4,1};
//		int[] B = new int[A.length];
//		Arrays.sort(A);
//		B=A;
//		System.out.println(Arrays.toString(B));
//		String [] strs = {"My","Dream","is","Java","Script"};
//		
//		Arrays.sort(strs);
//		System.out.println(Arrays.toString(strs));
//오버라이드란 이미 존재하는 매소드를 내가 새로 재정의 하는것을 말한다.

		//sort2();
		sort3();
	}
	public static void sort2() {
		Hero [] heros = {new Hero(100, "Hulk"),new Hero(200,"CA"),new Hero(40,"IronMan")};
		
		Arrays.sort(heros);
		System.out.println(Arrays.toString(heros));
		}
	public static void sort3() {
		Hero [] heros = {new Hero(100, "Hulk"),new Hero(200,"CA"),new Hero(40,"IronMan")};
		
		Arrays.sort(heros, new Comparator<Hero>() {

			@Override
		
//			public int compare(Hero o1, Hero o2) {
//				
//				return o1.compareTo(o2) * -1;
//			}
			public int compare(Hero o1, Hero o2) {
				if( o1.power > o2.power)
					return -1;
				else if (o1.power == o2.power)
					return 0;
				else {
					return 1;
				}
			}
		
		});
		System.out.println(Arrays.toString(heros));
		}
	
	
	static class Hero{
		int power;
		String name;
		
		public Hero(int power, String name) {
			this.power = power;
			this.name = name;
		}

//		@Override
//		public int compareTo(Hero o) {
//			return this.name.compareTo(o.name);
//			//새로들어온 것과 비교함
//		}
		public String toString() {
			return name+":"+power;
		}
	}
}

