//package algo_basic.day1;
//
//import java.util.Scanner;
//
//public class SWEA_사전평가_D3_원재의메모리복구하기 {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int TC =scanner.nextInt();
//		for (int t = 0; t < TC; t++) {
//			String str = scanner.next();
//			int cnt1 = 0;
//			int cnt2 = 0;
//			//System.out.println(str);
//			for (int i = 0; i < str.length(); i++) {
//				//System.out.println(str.charAt(i));
//				if(str.charAt(i) == '0') {
//					int idx = i;
//					while(idx<str.length()) {
//
//						if(str.charAt(idx) =='1') {
//							cnt1++;
//							i=idx-1;
//							break;
//						}
//						idx++;
//					}
//				}
//				if(str.charAt(i) == '1') {
//					int idx = i;
//					while(idx<str.length()) {
//
//						if(str.charAt(idx) =='0') {
//							cnt2++;
//							i = idx-1;
//							break;
//						}
//						idx++;
//					}
//				}
//			}
//			if(str.charAt(0) == '1') {
//				System.out.println("#"+(t+1)+" "+(cnt1+cnt2+1));
//			}
//			else {
//				System.out.println("#"+(t+1)+" "+(cnt1+cnt2));
//			}
//
//		}
//
//	}
//}
////10
//
//
////01010101010101010101010101010101010101010101010101
////01
////1000110010011111010110000100100000000001001
////10011010001110111010111010001100101101
////00110101100001010000110010111
////101111110101010100111100101111001
////01110011110001110
////1010101001010101010101010100111111
////01010100010100101100111010100010111111011001011000
////1111100101101110000
//
////#1 49
////#2 1
////#3 19
////#4 23
////#5 15
////#6 19
////#7 6
////#8 27
////#9 30
////#10 8