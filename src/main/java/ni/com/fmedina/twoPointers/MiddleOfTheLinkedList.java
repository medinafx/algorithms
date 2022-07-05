package ni.com.fmedina.twoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

     public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

         @Override
         public String toString() {
             return "ListNode{" +
                     "val=" + val +
                     ", next=" + next +
                     '}';
         }

         @Override
         public boolean equals(Object o) {
             if (this == o)
                 return true;
             if (o == null || getClass() != o.getClass())
                 return false;

             ListNode listNode = (ListNode) o;

             return val == listNode.val && Objects.equals(next, listNode.next);
         }

         @Override
         public int hashCode() {
             return Objects.hash(val, next);
         }
     }
}
