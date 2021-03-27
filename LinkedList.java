
/**
 *
 * @author James
 */

public class LinkedList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating parallel arrays to store data
        Node head = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeF = new Node(5);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeF;
        countNodes(head);
        displayNode(head);
        reverseLinkedList(head);
        displayNode(head);
        removeNode(head, 4);
        displayNode(head);
        oddEven(head);
        displayNode(head);

        // TODO code application logic here
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int countNodes(Node head) {
        int counter = 1;
        boolean node = true;
        while (node) {
            if (head.next != null) {
                head = head.next;
                counter++;
            } else {
                node = false;
            }
        }
        System.out.println(counter);
        return counter;
    }

    static void displayNode(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    static Node reverseLinkedList(Node head) {

        Node prev = null;
        while (head != null) {
            Node next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;

        }
        return prev;
    }

    static void removeNode(Node head, int val) {

        while (head != null && head.next != null) {
            if (head.next.data == val) { // check if next node is the one to delete
                if (head.next.next != null) { // if yes and its not last
                    head.next = head.next.next; // change curtrent node to point to next one after node to delete
                } else { // if node to delete is last
                    head.next = null; // just set current node next to null
                }
            }
            if (head.data == val && head.next != null) {
                head.data = head.next.data;
                head.next = head.next.next;
            } else {
                head = head.next;
            }

        }
    }

    static void nodeRemove(Node head, int val) {
        while (head != null && head.data == val) {
            head = head.next;

        }

        Node current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.next.data == val) {
                current_node.next = current_node.next.next;
            } else {
                current_node = current_node.next;
            }
        }
    }

    // Order the linkedlist by order indices then even indices
    static void oddEven(Node head) {
        if (head == null) {
            // return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            // Set odd head next value to even.next which is head.next.next
            odd.next = even.next;
            // set odd to odd.next so head.next.next to be able to keep chaning the linked
            // list
            odd = odd.next;
            // set even .next to odd.next so head.next.next.next
            even.next = odd.next;
            // then update even value to even.next so sam eas above
            even = even.next;

        }
        // to finish it off set odd.next to evenHead which is even.nex.next etc
        odd.next = evenHead;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;

        }

    }

}
