package ni.com.fmedina.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode next = head;
        while (next != null) {
            nodes.add(next);
            next = next.next;
        }
        return nodes.get(nodes.size() / 2);
    }
}
