package InterviewPreparation.linkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    //1.
    public static HasCircleLinkedList.ListNode reverseListRecursive(HasCircleLinkedList.ListNode head) {
        if (head == null || head.next == null)
            return head;
        HasCircleLinkedList.ListNode reversedList = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return reversedList;
    }
    //2.
    public static HasCircleLinkedList.ListNode reverseLinkedList(HasCircleLinkedList.ListNode head) {
        HasCircleLinkedList.ListNode prevNode = null;
        HasCircleLinkedList.ListNode currNode = head;
        while (currNode != null) {
            HasCircleLinkedList.ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
    public static void printList(HasCircleLinkedList.ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print("->");
                head = head.next;
        }
    }

    public static void main(String[] args) {
        HasCircleLinkedList.ListNode head = new HasCircleLinkedList.ListNode(1);
        head.next = new HasCircleLinkedList.ListNode(2);
        head.next.next = new HasCircleLinkedList.ListNode(3);
        head.next.next.next = new HasCircleLinkedList.ListNode(4);
        head = reverseListRecursive(head);
        printList(head);
    }
}
