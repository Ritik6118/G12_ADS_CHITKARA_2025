package Lecture_16;

public class Maximum_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int max=Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		sum(root);
		return max;
	}
	private int sum(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		int l=sum(root.left);
		int r=sum(root.right);
		max=Math.max(max, root.val+l+r);
		max=Math.max(max, root.val+l);
		max=Math.max(max, root.val+r);
		max=Math.max(max, root.val);
		return Math.max(root.val, Math.max(l, r)+root.val);
	}

}

class TreeNode {
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
