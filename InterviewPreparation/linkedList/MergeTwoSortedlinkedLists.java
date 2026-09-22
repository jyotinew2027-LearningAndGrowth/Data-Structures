package InterviewPreparation.linkedList;

public class MergeTwoSortedlinkedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode listMergeSortedLists(ListNode l1,ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode current = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return head.next;
    }

    static void printList(ListNode curr) {
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null)
                System.out.print("->");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next=new ListNode(10);
        head.next.next=new ListNode(15);
        head.next.next.next=new ListNode(40);

        ListNode head2 = new ListNode(2);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(5);

        ListNode result = listMergeSortedLists(head,head2);
        printList(result);
    }
}
