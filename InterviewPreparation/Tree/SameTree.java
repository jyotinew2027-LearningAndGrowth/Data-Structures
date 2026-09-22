package InterviewPreparation.Tree;

import java.util.ArrayDeque;

public class SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //1. O(N)
    public static boolean IsSameTree1(TreeNode p,TreeNode q) {
        if(p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return IsSameTree1(p.left,q.left) && IsSameTree1(p.right,q.right);
    }
    //2. O(N)
    public static boolean check(TreeNode p,TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return true;
    }
    public static boolean IsSameTree2(TreeNode p,TreeNode q) {
        if (p == null && q == null)
            return true;
        if (!check(p,q))
            return false;

        ArrayDeque<TreeNode> deqP = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<TreeNode>();
        deqP.addLast(p);
        deqQ.addLast(q);
        while (!deqP.isEmpty()) {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();
            if (!check(p,q))
                return false;
            if (p != null) {
                if (!check(p.left,q.left))
                    return false;
                if (p.left != null) {
                    deqP.addLast(p.left);
                    deqQ.addLast(q.left);
                }
                if (!check(p.right,q.right))
                    return false;
                if (p.right != null) {
                    deqP.addLast(p.right);
                    deqQ.addLast(q.right);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.left.left = new TreeNode(4);
        if (IsSameTree1(t1,t2))
            System.out.println("IsSameTree1 :: " + "true");
        else System.out.println("IsSameTree1 :: " + "false");
        if (IsSameTree2(t1,t2))
            System.out.println("IsSameTree2 :: " + "true");
        else System.out.println("IsSameTree2 :: " + "false");
    }
}
