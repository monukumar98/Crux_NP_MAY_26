package Lec30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int val = sc.nextInt();
		Node node = new Node(val);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			node.right = createTree();
		}
		return node;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int lf=max(nn.left);
		int rf=max(nn.right);
		return Math.max(nn.val, Math.max(lf, rf));

	}
	public boolean find(int val) {
		return find(root, val);
	}

	private boolean find(Node nn, int val) {
		if(nn==null) {
			return false;
		}
		if(nn.val==val) {
			return true;
		}
		boolean l=find(nn.left, val);
		boolean r=find(nn.right, val);
		return l||r;
		
	}
	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if(node==null) {
			return 0;
		}
		int lh=ht(node.left);
		int rh=ht(node.right);
		return Math.max(lh, rh)+1;
	}
	public void PerOrder() {
		PerOrder(root);
		System.out.println();
	}

	private void PerOrder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.print(node.val+" ");
		PerOrder(node.left);
		PerOrder(node.right);
	}
	public void InOrder() {
		InOrder(root);
		System.out.println();
	}
	
	private void InOrder(Node node) {
		if(node==null) {
			return ;
		}
		InOrder(node.left);
		System.out.print(node.val+" ");
		InOrder(node.right);
	}
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	
	private void PostOrder(Node node) {
		if(node==null) {
			return ;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val+" ");
	}
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node r=q.poll();
			System.out.print(r.val+" ");
			if(r.left!=null) {
				q.add(r.left);
			}
			if(r.right!=null) {
				q.add(r.right);
			}
		}
		System.out.println();
	}
}















