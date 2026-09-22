package InterviewPreparation.linkedList;

import java.util.HashSet;
import java.util.Set;

public class HasCircleLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //1.O(N)
    public static boolean hasCircle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head))
                return true;
            visited.add(head);
            head = head.next;
        }
        return false;
    }
    //2.O(N), Space : O(1)
    public static boolean hasCircle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
    //3.
    public static boolean hasCircle3(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (nodeSeen.contains(current)) {
                return true;
            }
            nodeSeen.add(current);
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head;
        System.out.println("hasCircle :: " + hasCircle(head));
        System.out.println("hasCircle2 :: " + hasCircle2(head));
        System.out.println("hascircle3 :: " + hasCircle3(head));
    }
}
