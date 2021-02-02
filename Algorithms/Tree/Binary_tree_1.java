package Tree;

import java.util.Scanner;
// Binary_tree_2_string
public class Binary_tree_1 {
    /**
     *
     * Created by Adil Myktybek
     * on 17.11.2020, 11:37
     *
     */

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    Node root;   // Binary search tree
    Binary_tree_1() { root = null; }

    int minValue(Node root) {
        int min_value = root.key;
        while (root.left != null) {
            min_value = root.left.key;
            root = root.left;
        }
        return min_value;
    }

    void printPostorder(Node node) {
        if (node == null) { return; }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void printInorder(Node node) {
        if (node == null) { return; }
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null) { return; }
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void print_Postorder() { printPostorder(root); }
    void print_Inorder() { printInorder(root); }
    void print_Preorder() { printPreorder(root); }

    void add(int key) { root = Rec_addElement(root, key); }
    Node Rec_addElement(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = Rec_addElement(root.left, key);
        } else if (key > root.key) {
            root.right = Rec_addElement(root.right, key);
        }

        return root;
    }

    void delete_Key(int key) { root = Rec_delete(root, key); }
    Node Rec_delete(Node root, int key) {
        if (root == null) { return root; }

        if (key < root.key) {
            root.left = Rec_delete(root.left, key);
        } else if (key > root.key) {
            root.right = Rec_delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.key = minValue(root.right);
            root.right = Rec_delete(root.right, root.key);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_tree_1 tree = new Binary_tree_1();
        int[] array = new int[]{73, 37, 16, 38, 625, 121, 256};
        for (int i = 0; i < array.length; i++){
            tree.add(array[i]);
        }

        System.out.print("Inorder: [");
        tree.print_Inorder();                      // print_Postorder(), print_Preorder()
        // tree.print_Preorder();
        System.out.print("]");

        System.out.print("\nEnter: ");
        int delete_this = sc.nextInt();
        System.out.println("After remove: " + delete_this);
        tree.delete_Key(delete_this);

        System.out.print("Inorder: [");
        tree.print_Inorder();
        // tree.print_Preorder();
        System.out.print("]");
    }
}