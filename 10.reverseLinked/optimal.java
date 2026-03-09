
// Link for Question is - https://leetcode.com/problems/reverse-linked-list/description/
import java.util.* ;
public class optimal {

    // Linked List Node Structure
      static class ListNode {
          int val ;
          ListNode next ;

          ListNode(int val){
              this.val = val ;
              this.next = null ;
          }
      }

      // Optimal Solution
    public static ListNode reverseList(ListNode head){
        return head;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linked list : ");
        int n = sc.nextInt();
        ListNode head = null;
        ListNode tail = null;
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter the value of the node : ");
            int value = sc.nextInt();
        }
        ListNode reversedHead = reverseList(head);
        System.out.println("The reversed linked list is : ");
        while(reversedHead != null){
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
        sc.close();
    }
}           