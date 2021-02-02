package Tree;

/**
 *
 * Created by Adil Myktybek
 * on 17.11.2020, 23:25
 *
 */

public class Binary_tree_2_string {
    public static void main(String[] argv) {
        /* 73, 37, 16, 38, 625, 121, 256
        // 16 37 38 73 121 256 625 --- inorder
        // String[] months = { "73","37","16","20","625","121", "256"};
        // String[] months = { "Jan","Feb","Mar","Apr","May","Jun", "Jul",
                              "Aug","Sep","Oct","Nov","Dec" };

         4              - INORDER
      /     \
     2        6
    / \      / \
   1   3    5   7
                              */

        String[] months = { "7","5","2","3","6","1", "4" };
        Tree tree = new Tree();
        for (int i = 0; i < months.length; i++)
            tree.insert(months[i]);
        tree.inorderTraversal();
        System.out.println("\n---------------");


    }
}

class TreeNode {
    public String data;
    public TreeNode left, right;
    public TreeNode(String d) {
        data = d;
        left = right = null;
    }
}

class Tree {
    private TreeNode root;

    public void insert(String d) {
        if (root == null) {
            root = new TreeNode(d);
            return;
        }
        TreeNode loc = root;
        while (true) {
            if (d.compareTo(loc.data) < 0) {
                if (loc.left != null) loc = loc.left;
                else { loc.left = new TreeNode(d); break; }
            } else if (d.compareTo(loc.data) > 0) {
                if (loc.right != null) loc = loc.right;
                else { loc.right = new TreeNode(d); break; }
            } else break;
        }
    }

    public void inorderTraversal() { inorderT(root); }
    private void inorderT(TreeNode t) {
        if (t != null) {
            inorderT(t.left);
            System.out.print(t.data + " ");
            inorderT(t.right);
        }
    }
}