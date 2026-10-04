package Lec31;
import java.util.*;
public class Binary_Tree_Right_Side_View {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int maxdepth=0;
		public List<Integer> rightSideView(TreeNode root) {
			 List<Integer> ll = new ArrayList<>();
			 rightView(root, ll, 1);
			 return ll;
		}
		public void rightView(TreeNode root,List<Integer> ll,int curr_level) {
			if(root==null) {
				return;
			}
			if(maxdepth<curr_level) {
				ll.add(root.val);
			maxdepth=curr_level;
			}
			
			rightView(root.right, ll, curr_level+1);
			rightView(root.left, ll, curr_level+1);
			
		}
	}

}












