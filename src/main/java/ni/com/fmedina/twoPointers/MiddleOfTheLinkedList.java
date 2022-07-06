package ni.com.fmedina.twoPointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 *
 * Example 2:
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class MiddleOfTheLinkedList {
    public ListNode findMiddleNodeUsingArray(ListNode head) {
        List<ListNode> nodes = new ArrayList<>(100);
        ListNode next = head;
        while (next != null) {
            nodes.add(next);
            next = next.next;
        }
        return nodes.get(nodes.size() / 2);
    }

    public ListNode findMiddleNodeUsingFastAndSlowPointer(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
