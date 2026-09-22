package InterviewPreparation.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBTree {
    static class TreeNode {
        int data;
        TreeNode left,right;
        TreeNode(int x) {
            data = x;
            left = right = null;
        }
    }

    //1. O(N)
    public static TreeNode invertTree1(TreeNode root) {
        if(root != null) {
            invertTree1(root.left);
            invertTree1(root.right);
            //swap children
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
        return root;
    }

    //2.
    public static TreeNode invertTree2(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.poll();
                TreeNode temp = currentNode.left;
                currentNode.left = currentNode.right;
                currentNode.right = temp;

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        invertTree1(root);
        invertTree2(root);
    }
}
