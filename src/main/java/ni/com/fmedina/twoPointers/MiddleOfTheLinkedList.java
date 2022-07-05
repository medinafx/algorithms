package ni.com.fmedina.twoPointers;

import java.util.ArrayList;
import java.util.List;

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
