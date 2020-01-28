package algo_basic.day3;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		System.out.println(num1 + ":" + Integer.toBinaryString(num1));
		System.out.println((num1<<1) + ":" + Integer.toBinaryString(num1<<1));
		System.out.println((num1>>1) + ":" + Integer.toBinaryString(num1>>1));
		// bit masking 연산
		int status = 0; //32bit, 각 bit는 0/1 --> 포함 여부 표현
		int student1 = 1;
		//2-1 포함 여부: & 연산
		System.out.println("student1 포함?" + (status & student1));
		//2-2 포함 시키기: | 연산
		status |=student1;
		System.out.println("student1 포함?" + (status & student1));
		
		System.out.println("현재 상태 :" + Integer.toBinaryString(status));
		int student2 = 0b100;
		System.out.println(status & student2);
		status |= student2;
		System.out.println("현재 상태 :" + Integer.toBinaryString(status));
		
		int num = 3;
		System.out.println(num%2 == 0? "짝수":"홀수");
		System.out.println((num&1) == 0? "짝수":"홀수");
	}

}
