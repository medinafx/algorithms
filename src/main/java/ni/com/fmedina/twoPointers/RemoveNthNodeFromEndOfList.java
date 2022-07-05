package ni.com.fmedina.twoPointers;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 *
 * Example 2:
 * Input: head = [1], n = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [1,2], n = 1
 * Output: [1]
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1)
            return null;

        ListNode dummy = new ListNode(-1, head);
        ListNode nthNode = dummy;
        ListNode fast = head;

        //move head by n nodes next to first node (gap = n)
        //nthNode.next is at n distance(back) from head
        for (int distance = 1; distance < n; distance++) {
            fast = fast.next;
        }

        //increase both pointers till head reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            nthNode = nthNode.next;
        }

        nthNode.next = nthNode.next.next;
        return dummy.next;
    }
}
