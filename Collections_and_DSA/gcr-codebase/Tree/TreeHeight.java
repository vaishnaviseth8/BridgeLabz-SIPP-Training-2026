class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class TreeHeight {

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        System.out.println(height(root));
        System.out.println(isTooDeep(root, 2));
    }
}