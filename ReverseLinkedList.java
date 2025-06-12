package jun12;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head;

        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev;              
            prev = current;                   
            current = nextNode;               
        }

        return prev; 
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        ListNode reversed = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversed);
    }
}
