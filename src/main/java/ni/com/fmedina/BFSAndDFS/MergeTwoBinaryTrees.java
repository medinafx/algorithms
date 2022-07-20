package ni.com.fmedina.BFSAndDFS;

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    public TreeNode merge(TreeNode n1, TreeNode n2) {
        if (n1 == null)
            return n2;

        if (n2 == null)
            return n1;

        n1.val += n2.val;

        n1.left = merge(n1.left, n2.left);
        n1.right = merge(n1.right, n2.right);

        return n1;
    }
}
