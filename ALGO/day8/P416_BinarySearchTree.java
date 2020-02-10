package algo_basic.day8;

public class P416_BinarySearchTree {
	//root node
	private static Node root;
	public static Node search(int v) {
		if(root == null)
			return null;

		Node current = root;

		while(true) {
			if(current == null) {
				return null;
			}

			if(current.v == v) {

				return current;
			}
			else if(current.v > v) {

				current = current.l;
			}
			else{

				current = current.r;
			}
		}
	}
	public static boolean addNode(int v) {
		//새 노드를 추가하려면 검색에 실패해야한다. !!!!
		//실패하는 지점이 노드가 삽입되는 지점

		if(root == null) {
			root = new Node(v);
			return true;
		}
		Node current = root;
		while(true) {
			if(current.v == v) { //검색에 성공햇다면 추가는 할수없다. 중복떄문
				return false;
			}else if(current.v >v){
				//현재 노드의 값보다 새로 들어온 녀석이 크면? 왼쪽에 관심 갖기
				//마침 왼쪽 노드가 비어있따면? 삽입될 위치
				if(current.l == null) {
					Node newNode = new Node(v);
					current.l = newNode;
					newNode.p = current; // 삭제시 부모를 쉽게 찾기 위해 부모 추가
					return true;
				}else {
					//비어있지 않다면 왼쪽노드를 이용해서 다시탐색
					current = current.l;
				}
			}else {
				if(current.r == null) {
					Node newNode = new Node(v);
					current.r = newNode;
					newNode.p = current;
					return true;
				}else {
					current = current.r;
				}
			}
		}

	}
	public static void main(String[] args) {
		addNode(5);
		addNode(3);
		System.out.println(search(5));
		addNode(1);
		System.out.println(search(3));
		addNode(4);
		System.out.println(search(3));
		addNode(2);
		System.out.println(search(1));
		System.out.println(search(10));
		deleteNode(3);
	}
	public static boolean deleteNode(int v) {
		Node target = search(v);
		if(target == null) {
			return false;
		}else {
			if(target.l == null & target.r == null){
				if(target.p.l == target) {
					target.p.l = null;
				}else {
					target.p.r = null;
				}
			}
			else if(target.l == null || target.r == null) {
				Node child = target.l == null? target.r : target.l;
				//부모에게 자식위탁
				if(target.p.l == target) {
					target.p.l = child;
				}else {
					target.p.r = child;
				}
			}else { // 자식이 둘인경우
				//1.왼쪽 트리에서 가장 큰놈을 찾는다.
				Node max = target.l;
				while(max.r!=null) {
					max = max.r;
				}
				//대상 노드를 지워버리고 .
				deleteNode(max.v);
				//2.삭제 대상 노드의 값을 최대 노드의 값으로 변경
				target.v = max.v;
			}
		}
		return true;
	}
	static class Node{
		int v;
		Node l,r,p;
		public Node(int v) {
			super();
			this.v = v;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("[" + v + "(")
					.append(l == null?"n":l.v).append(",")
					.append(r == null?"n":r.v)
					.append(")]");
			return sb.toString();
		}

	}
}
