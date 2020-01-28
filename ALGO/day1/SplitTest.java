package algo_basic.day1;

public class SplitTest {
	public static void split1(){
		String src = "10,030,042";

		String[] splited = src.split(",");
		int sum = 0;
		for(int i =0;i<splited.length;i++) {
			sum+=Integer.parseInt(splited[i]);
		}
		System.out.println(sum);
	}
	public static void split2() {
		String src = "이름:홍길동,Java:100,HTML:80,Script:85";
		//이름과 총점 출력
		String[] splited = src.split(",");
		int sum = 0;
		for (int i = 0; i < splited.length; i++) {
			String[] splited2 = splited[i].split(":");
			if(i == 0)
				System.out.println("이름:"+splited2[1]);
			else {
				sum +=Integer.parseInt(splited2[1]);
			}
		}
		//System.out.println("총점:" + sum);
		System.out.printf("총점:%d",sum);
	}

	public static void main(String[] args) {
		split2();
	}
}

