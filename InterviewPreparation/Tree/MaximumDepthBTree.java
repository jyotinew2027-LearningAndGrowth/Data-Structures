package InterviewPreparation.Tree;

import java.util.concurrent.TransferQueue;

public class MaximumDepthBTree {
    //O(N)
    public static int maxDepthBTree(SameTree.TreeNode root) {
        if (root == null)
            return 0;
        else {
            int left_height = maxDepthBTree(root.left);
            int right_height = maxDepthBTree(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }
    public static void main(String[] args) {
        SameTree.TreeNode root = new SameTree.TreeNode(1);
        root.left = new SameTree.TreeNode(2);
        root.right = new SameTree.TreeNode(3);
        root.left.left = new SameTree.TreeNode(4);
        System.out.println("maxDepth :: " + maxDepthBTree(root));
    }
}
