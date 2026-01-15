import java.util.ArrayList;

public class Brute {

    // 🔹 Linked List Node structure
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 🔹 Brute force reverse using ArrayList
    public static ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Store values from linked list
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Create reversed linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = list.size() - 1; i >= 0; i--) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        // Step 3: Return new head
        return dummy.next;
    }

    // 🔹 Function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the list
        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }
}
