class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class InsertBST {

    public static Node insert(Node node, int id) {
        if (node == null) {
            return new Node(id);
        }

        if (id < node.val) {
            node.left = insert(node.left, id);
        } else if (id > node.val) {
            node.right = insert(node.right, id);
        }

        return node;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        root = insert(root, 40);

        inorder(root);
    }
}