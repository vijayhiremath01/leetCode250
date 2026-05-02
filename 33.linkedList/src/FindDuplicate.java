import java.util.* ;

public class FindDuplicate {

    // Globally defined ListNode
    static class ListNode {
        int val ;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null ;
        }
    }

    // Method to find the duplicates
    public static void findDuplicate(ListNode head){

        HashSet<Integer> set = new HashSet<>();
        ListNode temp = head ;

        while(temp != null){
            if(set.contains(temp.val)){
                System.out.println("The Duplicate value is : " + temp.val);
            } else {
                set.add(temp.val);
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of the list : ");
     int n = sc.nextInt();

     ListNode head = null ;
     ListNode tail = null ;

     System.out.println("Enter the elements of the list : ");
     for (int i = 0; i < n; i++) {
         int val = sc.nextInt();

         ListNode newNode = new ListNode(val);

         if(head == null){
             head = newNode;
             tail = newNode ;
         } else {
             tail.next = newNode;
             tail = newNode ;
         }
     }

     // Print the ListNode
        ListNode tempPrint = head;

        while (tempPrint != null) {
            System.out.print(tempPrint.val + " -> ");
            tempPrint = tempPrint.next;
        }

     // Finding the Duplicates in the NODELIST
        System.out.println("");
      findDuplicate(head);
    }
}
