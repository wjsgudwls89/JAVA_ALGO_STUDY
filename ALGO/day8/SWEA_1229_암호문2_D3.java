package algo_basic.day8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1229_암호문2_D3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		for (int tc = 0; tc < 10; tc++) {

			List<String> pw = new LinkedList<>();

			String num = sc.nextLine();

			for (int i = 0; i < Integer.parseInt(num); i++) {
				String str = sc.next();
				pw.add(str);
			}
			sc.nextLine();
			String add = sc.nextLine();
			
			for (int i = 0; i < Integer.parseInt(add); i++) {
				String id = sc.next();
				if(id.equals("I")) {
					String idx = sc.next();
					String dixnum = sc.next();
					int tidx = Integer.parseInt(idx);
					for (int j = 0; j < Integer.parseInt(dixnum); j++) {
						String ch = sc.next();
						pw.add(tidx, ch);
						tidx++;
					}
				}else if(id.equals("D")) {
					String idx = sc.next();
					String dixnum = sc.next();
					int tidx = Integer.parseInt(idx);
					for (int j = 0; j < Integer.parseInt(dixnum); j++) {
						pw.remove(tidx);
					}
				}
			}
			sc.nextLine();
			System.out.print("#"+(tc+1)+" ");
			for (int i = 0; i < 10; i++) {
				System.out.print(pw.get(i)+" ");
			}
			System.out.println();
		}
	}
}
