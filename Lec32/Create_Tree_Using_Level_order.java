package Lec32;
import java.util.*;

public class Create_Tree_Using_Level_order {
	class Node {
		Node left;
		Node right;
		int val;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;

		}
	}
	private Node root;
	public Create_Tree_Using_Level_order() {
		// TODO Auto-generated constructor stub
		createTree();
	}
	private void createTree() {
		// TODO Auto-generated method stubs
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int x=sc.nextInt();
		root= new Node(x);
		q.add(root);
		while(!q.isEmpty()) {
			Node n  = q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node left=new Node(c1);
				n.left=left;
				q.add(left);
			}
			if(c2!=-1) {
				Node right=new Node(c2);
				n.right=right;
				q.add(right);
			}
		}
		
	}
}













