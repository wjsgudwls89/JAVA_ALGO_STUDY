package algo_basic.day1;

import java.util.Scanner;

public class SWEA_2056_D1_연월일달력 {

	private static int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		scanner = new Scanner(src);
		int TC = scanner.nextInt();
		for (int i = 0; i < TC; i++) {
			//개별 test case 처리
			sb.append("#").append(i+1).append(" ");
			String data = scanner.next();
			//System.out.println(data);
			String year = data.substring(0,4);
			String month = data.substring(4,6);
			String day = data.substring(6, 8);
			int a =Integer.parseInt(year);
			int b =Integer.parseInt(month);
			int c =Integer.parseInt(day);

			if(b>12 || b<1) {
				sb.append("-1");
				sb.append("\n");
				continue;
			}
			else {
				
				if(c>days[b-1]) {
					sb.append("-1");
				}
				else {
					sb.append(year);
					sb.append("/");
					sb.append(month);
					sb.append("/");
					sb.append(day);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	private static String src = "5\r\n" + 
			"22220228\r\n" + 
			"20150002\r\n" + 
			"01010101\r\n" + 
			"20140230\r\n" + 
			"11111111";
}
