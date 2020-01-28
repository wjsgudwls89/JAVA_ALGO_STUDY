package algo_basic.day3;

public class RecurExercise {
	static int start;
	static int end;
	static String str = "주주만주주주";
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {
// TODO Auto-generated method stub
//		System.out.println(getMulti(2,4));
//		System.out.println(getPower(2,4));
//		System.out.println(getSumDigit(1234,0));
//		System.out.println(getLength(str));
//		printReStr(str);\
//		printDigit(10);
//		System.out.println(sumArr(arr, 0,0));
//		System.out.println(maxArr(arr, 0,0));
//		System.out.println(BinarySearch(arr, 0, arr.length,10,0));
//		System.out.println(Palindrome(0,str.length()-1, str));
	}

	public static int getMulti(int n, int m) {
		if(n == m) {
			return m;
		}
		else {
			return n* getMulti(n+1,m);
		}
	}
	public static int getPower(int n, int m) {
		if(m == 0) {
			return 1;
		}
		else {
			return n * getPower(n, m-1);
		}
	}
	public static int getSumDigit(int n,int sum) {
		if(n < 10) {
			return sum + n;
		}
		else {
			return getSumDigit(n/10,sum+n%10);
		}
	}
	public static int getLength(String now) {
		if(now.equals("")) {
			return 0;
		}
		else {
			return 1 + getLength(now.substring(1));
		}
	}
	public static void printStr(String now) {
		if(now.equals(""))
			return;
		System.out.println(now.charAt(0));
		printStr(now.substring(1));
	}

	public static void printReStr(String now) {
		if(now.equals("")) {
			return;
		}
		printReStr(now.substring(1));
		System.out.println(now.charAt(0));
	}
	public static void printDigit(int now) {
		if(now  == 0) {
			return;
		}
		printDigit(now/2);
		System.out.println(now%2);
	}
	public static int sumArr(int now[],int idx,int sum) {
		if(idx == now.length-1) {
			return now[idx];
		}
		else {
			return sum + sumArr(now,idx+1,sum+arr[idx]);
		}
	}
	public static int maxArr(int now[],int idx,int max) {
		if(arr[idx] > max) {
			max = arr[idx];
		}

		if(idx == now.length-1) {
			return max;
		}
		else {

			return maxArr(now,idx+1,max);
		}
	}
	public static int BinarySearch(int arr[], int start,int end,int target,int depth) {
		int mid = (start+end-1) /2;
		if(depth > arr.length)
			return -1;
		if(arr[mid] == target) {
			return mid;
		}
		else if(arr[mid] < target){
			start = mid+1;
			return BinarySearch(arr, start, end, target,depth +1);
		}
		else {
			end = mid-1;
			return BinarySearch(arr, start, end, target,depth +1);
		}

	}
	public static boolean Palindrome(int start,int end,String str) {
		if(start+1 == end)
			return str.charAt(start) == str.charAt(end);
		else if(start == end) {
			return true;
		}
		else {
			if(str.charAt(start) == str.charAt(end)) {
				return Palindrome(start+1,end-1,str);
			}
			else {
				return false;
			}
		}
	}

}
