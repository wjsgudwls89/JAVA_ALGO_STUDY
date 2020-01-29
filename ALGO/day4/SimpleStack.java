package algo_basic.day4;

import java.util.Stack;

public class SimpleStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		System.out.println(stack.size());
		int top = stack.peek(); // 그냥확인
		System.out.println(top + " : "+stack.size());
		top =stack.pop();
		System.out.println(top + " : "+stack.size());
		System.out.println(stack.isEmpty());
		
	}

}
