public class PlaylistInsertion {

    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
        }
    }

    static void insertAfter(Node current, int trackId) {
        if (current == null) {
            return;
        }

        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.trackId + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        insertAfter(head.next, 30);

        display(head);
    }
}