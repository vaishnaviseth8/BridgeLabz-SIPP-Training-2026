public class RedirectLoopDetection {

    static class Node {
        int urlId;
        Node next;

        Node(int urlId) {
            this.urlId = urlId;
        }
    }

    static boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println(hasRedirectLoop(first));
    }
}