package LinkedList;

import LinkedList.SinglyLinkedList.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode result = dummyHead;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int digit = x + y + carry;
            carry = digit / 10;

            result.next = new ListNode(digit % 10);
            result = result.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            result.next = new ListNode(1);
        }

        return dummyHead.next;
    }
}
