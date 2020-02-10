package algo_basic.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_1231_중위순회_D4 {
	static int n;
	static Node[] tree;
	static List<Character> c = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 0; tc < 10; tc++) {



			n = sc.nextInt();
			sc.nextLine();
			tree = new Node[n+1];
			for (int i = 1; i <= n; i++) {
				String str = sc.nextLine();
				String[] temp = str.split(" ");
				Node pnode = getNode(Integer.parseInt(temp[0]));
				pnode.c = temp[1];
				if(temp.length>2) {
					for (int j = 2; j < temp.length; j++) {
						if(j == 2) {
							Node tnode = getNode(Integer.parseInt(temp[j]));
							if(pnode.l == null)
								pnode.l = tnode;
						}
						if(j == 3) {
							Node tnode = getNode(Integer.parseInt(temp[j]));
							if(pnode.r == null)
								pnode.r = tnode;
						}
					}
				}
			}
			System.out.print("#"+(tc+1)+" ");
			search(tree[1]);
			System.out.println(c);
			System.out.println();
		}
	}
	public static void search(Node node) {
		if(node == null) {
			return;
		}
		search(node.l);
		//System.out.print(node.c);
		c.add(node.c.charAt(0));
		search(node.r);
		
		
		
	}
	private static Node getNode(int idx) {

		if(tree[idx] == null) {
			tree[idx] = new Node(idx);
		}
		return tree[idx];
	}
	static class Node{
		int v;
		String c;
		Node l,r;
		public Node(int v) {
			super();
			this.v = v;
		}
	}

}
