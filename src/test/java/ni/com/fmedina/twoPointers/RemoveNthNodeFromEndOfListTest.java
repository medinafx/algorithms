package ni.com.fmedina.twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNthNodeFromEndOfListTest {

    private static final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    void removeNthFromEnd() {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode head = new ListNode(1, n2);
        int nthNode = 2;

        removeNthNodeFromEndOfList.removeNthFromEnd(head, nthNode);
        assertEquals(n3.next, n5);
    }
}