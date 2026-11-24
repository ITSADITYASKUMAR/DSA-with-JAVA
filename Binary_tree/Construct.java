package Binary_tree;

import java.util.Scanner;

public class Construct {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public String toString() {
			return this.val + " ";
		}
	}

	class check {
		int val = 100;

	}

	Scanner scn;
	private TreeNode root = null;

	public Construct(String str) {
		scn = new Scanner(str);
		root = construct(null, false);
	}

	public TreeNode construct(TreeNode root, boolean lc) {
		if (root == null) {
			System.out.println("enter the value for root node");
		} else {
			if (lc == true) {
				System.out.println("enter the value for left child of " + root.val);
			} else {
				System.out.println("enter the value for right child of" + root.val);
			}
		}

		TreeNode nn = new TreeNode();
		int val = scn.nextInt();
		nn.val = val;
		System.out.println(nn.val + " has left child?");
		boolean hlc = scn.nextBoolean();
		if (hlc == true) {
			nn.left = construct(nn, true);
		}
		System.out.println(nn.val + "has right child?");
		boolean hrc = scn.nextBoolean();
		if (hrc == true) {
			nn.right = construct(nn, false);
		}
		return nn;

	}

	public void display() {
		display(root);
	}

	private void display(TreeNode root) {
		if (root == null)
			return;
		String str = "";
		if (root.left == null) {
			str += "." + " <- " + root.val;
		} else {
			str += root.left.val + "<-" + root.val;
		}
		if (root.right == null) {
			str += "-> " + ".";
		} else {
			str += "-> " + root.right.val;
		}
		System.out.println(str);
		display(root.left);
		display(root.right);
	}

}