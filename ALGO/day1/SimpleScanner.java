package algo_basic.day1;
import java.util.Scanner;
public class SimpleScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read3();
	}
	public static void read0() {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.next();
			System.out.println(str);
			if(str.equals("x") || str.equals("X"))
				break;
		}
	}
	private static String data = "hello java world x";
	public static void read1() {
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(data);
		while(scanner.hasNext()) {
			String str = scanner.next();
			System.out.println(str);
			if(str.equals("x") || str.equals("X"))
				break;
		}
	}
	public static void read2() {
		String data = "1 2 3 4 5";
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(data);
		int sum = 0;
		while(scanner.hasNextInt()) {
			int str = scanner.nextInt();
			System.out.println(str);
			sum += str;
			System.out.println();
			if(str == 5)
				break;
		}
	}
	//기본형 데이터를 rab으로 감쌈
	//ex _ Integer.parseInt(str)
	
	public static void read3() {
		StringBuilder sb = new StringBuilder();
		String data = "1, 2, 3, 4, 5";
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(data);
		scanner.useDelimiter(", ");
		int sum = 0;
		while(scanner.hasNextInt()) {
			int str = scanner.nextInt();
			//System.out.println(str);
			sb.append(str);
			if(str == 5)
				break;
		}
		System.out.println(sb);
	}
	
}
