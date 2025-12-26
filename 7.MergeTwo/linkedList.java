import java.util.*;

class Node {
    int data ;
    Node next ;
}

public class linkedList {
   public static void main(String[] args) {
       // Linked List
       // Creating nodes
       Node n1 = new Node();
       n1.data = 10 ;

       Node n2 = new Node();
       n2.data = 20 ;

       Node n3 = new Node();
       n3.data = 30 ;

       // Linking nodes
       n1.next = n2 ;
       n2.next = n3 ;
       n3.next = null ;

       // Set head as n1
       Node head = n1 ;

       // Traversing the data
       Node temp = head ;
       while(temp != null){
           System.out.println(temp.data + "--->" );
           temp = temp.next;
       }
       System.out.println(" ");
    }
}