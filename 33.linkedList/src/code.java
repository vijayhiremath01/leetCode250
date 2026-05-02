import java.util.* ;

public class code {

    public static void main(String[] args) {

        // Learning Linked list from Basics
          class ListNode {
              int val ;
              ListNode next;

              ListNode(int val) {
                  this.val = val ;
                  this.next = null ;
              }
          }

         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

}
