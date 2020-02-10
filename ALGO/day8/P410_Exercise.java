package algo_basic.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P410_Exercise {
	private static int v= 13;
	private static String data = "1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
	private static NODE[] tree;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		makeTree();
		System.out.println(Arrays.toString(tree));
		//preOrder(tree[1]);
		inOrder(tree[1]);
		//postOrder(tree[1]);
		
		
			
			

	}
	public static void makeTree() {
		
		tree = new NODE[v+1];
		String[] splited = data.split(" ");
		for (int i = 0; i < splited.length; i+=2) {
			int parent = Integer.parseInt(splited[i]);
			int child = Integer.parseInt(splited[i+1]);
			NODE pNode = getNode(parent);
			NODE cNode = getNode(child);
			
			//노드간 관계 맺어주기
			if(pNode.l == null) pNode.l = cNode;
			
			else {
				pNode.r = cNode;
			}
		}
		
	}
	//idx  기반으로 기존 노드 또는 새로 생성한 노드 반환
	private static NODE getNode(int idx) {
		
		if(tree[idx] == null) {
			tree[idx] = new NODE(idx);
		}
		return tree[idx];
	}
	public static void preOrder(NODE node) {
		if(node == null) return;
		
		System.out.println(node.v+"  ");
		preOrder(node.l);
		preOrder(node.r);
	}
	public static void postOrder(NODE node) {
		if(node == null) return;
		
		
		postOrder(node.l);
		postOrder(node.r);
		System.out.println(node.v+"  ");
	}
	public static void inOrder(NODE node) {
		if(node == null) return;
		
		
		inOrder(node.l);
		System.out.println(node.v+"  ");
		inOrder(node.r);
		
	}
	static class NODE{
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("[" + v + "(")
					.append(l == null?"n":l.v).append(",")
					.append(r == null?"n":r.v)
					.append(")]");
			return sb.toString();
		}
		int v;
		NODE l, r;
		public NODE(int v) {
			
			this.v = v;
			
		}
		
		
	}

}
