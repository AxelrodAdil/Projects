package Tree;

import java.util.*;
// import java.util.concurrent.*;

public class Binary_tree_3_string { //implements Runnable {
    /**
     *
     * Created by Adil Myktybek
     * on 18.11.2020, 01:37
     *
     */

// with Hashmap
    public static final HashMap<Integer, String> map = new HashMap<>();

    class Node {
        int key;
        String value;
        Node left, right;

        public Node(int item, String string_this) {
            key = item;
            value = string_this;
            left = right = null;
        }
    }
    Node root;   // Binary search tree
    Binary_tree_3_string() { root = null; }

    int minValue(Node root) {
        int min_value = root.key;
        while (root.left != null) {
            min_value = root.left.key;
            root = root.left;
        }
        return min_value;
    }

    void printInorder(Node t) {
        /*if (node == null) { return; }
        printInorder(node.left);
        // System.out.print(node.key + " ");
        System.out.println(node.key + "=" + node.value);
        printInorder(node.right);*/

        if (t != null) {
            printInorder(t.left);
            // System.out.println(t.key + "=" + t.value + ", ");
            // System.out.print(t.value + "  ");
            System.out.print(t.key+ " ");
            printInorder(t.right);
        }
    }
    void print_Inorder() { printInorder(root); }

    void add(int key, String string_this) { root = Rec_addElement(root, key, string_this); }
    Node Rec_addElement(Node root, int key, String string_this) {
        if (root == null) {
            root = new Node(key, string_this);
            return root;
        }

        if (key < root.key) {
            root.left = Rec_addElement(root.left, key, string_this);
        } else if (key > root.key) {
            root.right = Rec_addElement(root.right, key, string_this);
        }

        return root;
    }

// ------------------------------------------------------------------------------

    void remove_hashmap(int key) {
        map.remove(key);
    }

    static int get_key_print(String str) {
        int temp = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(str)) {
                temp = entry.getKey();
            }
        }

        if (temp == 0) {
            System.out.println("Not found!");
            System.exit(-1);
        }
        return temp;
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

    void just_print_map() {
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.print(e.getKey() + "-" + e.getValue() + ", ");
        }
    }

    void example_print_hashmap_inorder() {
        Set<Map.Entry<Integer, String>> s = map.entrySet();
        List<Map.Entry<Integer, String>> l = new ArrayList<Map.Entry<Integer, String>>(s);
        Collections.sort(l,new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> arg0,
                               Map.Entry<Integer, String> arg1) {

                return (arg0.getValue().compareTo(arg1.getValue()));
            }
        });

        System.out.print("Inorder: ");
        for(Map.Entry<Integer, String> entry:l){
            System.out.print(entry.getValue() + ", ");
        }
    }

// -----------------------------------------------------------------------------------------------

    /*Thread thread;
    public void run() {
        try {
            System.out.println("Thread.sleep: 1000");
            Thread.sleep(1000);  // milliseconds
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

    /*void do_it_multi() {
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("--- 1000 ---");
            };
        };
        t.scheduleAtFixedRate(tt,500,1000);
    }*/

    public static void main(String[] args){
        /*Thread thread = new Thread(new Binary_tree_3_string());
        thread.start();  // call run()*/

        Scanner sc = new Scanner(System.in);
        Binary_tree_3_string tree = new Binary_tree_3_string();
        int[] array = new int[]{73, 37, 16, 38, 625, 121, 256};
        String[] array_String = new String[]{ "4D","2B","1A","3C","7G","5E","6F" };

        // int n = 1;
        for (int k = 0; k < array.length; k++){
            map.put(array[k], array_String[k]);
            tree.add(array[k], array_String[k]);
            // tree.add(n++, array_String[i]);
        }
        tree.just_print_map();
        System.out.println("\n-------------------------------------------------------\n");

        System.out.print("Inorder: [");
        tree.print_Inorder();  // 16 37 38 73 121 256 625    // print_Postorder(), print_Preorder()
        System.out.print("]");

        System.out.print("\nEnter: ");
        String delete_this = sc.nextLine();
        int temp = tree.get_key_print(delete_this);
        System.out.println("Here = " + temp);
        System.out.println("After remove: " + delete_this);
        tree.remove_hashmap(temp);
        tree.delete_Key(temp);

        System.out.print("Inorder: [");
        tree.print_Inorder();
        System.out.print("]");

        System.out.println("\n-------------------------------------------------------\n");
        tree.example_print_hashmap_inorder();
    }
}