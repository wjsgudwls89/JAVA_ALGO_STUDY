package com.basic;

public class SwitchTest {

	public static void main(String[] args) {
		char code='a';
		switch (code) {
		case 'A':
		case 'a':
			System.out.println("level-1");
			break;
		case 'B':
		case 'b':
			System.out.println("level-2");
			break;
		default:
			System.out.println("level-3");
			break;
		}
		// TODO Auto-generated method stub
//		int score = 70;
//		switch (score) { // byte, short, int, char, String
//		case 90:
//			System.out.println("class=1");
//			break;
//		case 80:
//			System.out.println("class=2");
//			break;
//		case 70:
//			System.out.println("class=3");
//			break;
//		case 60:
//			System.out.println("class=4");
//			break;
//
//		default:
//			break;
//		}
	}

}
