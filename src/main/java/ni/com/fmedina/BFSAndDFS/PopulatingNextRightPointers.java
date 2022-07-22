package ni.com.fmedina.BFSAndDFS;

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children.
 * The binary tree has the following definition:
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should
 * be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 */
public class PopulatingNextRightPointers {
    public Node connect(Node root) {
        if (root == null)
            return root;

        Node current = root;
        while (current.left != null) {
            Node nextLevel = current.left;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                } else {
                    current.right.next = null;
                }
                current = current.next;
            }
            current = nextLevel;
        }
        return root;
    }
}
