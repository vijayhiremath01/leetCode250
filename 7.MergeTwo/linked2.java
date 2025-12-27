import java.util.* ;

class Node {
    String data;
    Node next ;
}
public class linked2 {
    public static void main(String[] args) {
       // Creating nodes
        Node n1 = new Node();
        n1.data = "Vijay";

        Node n2 = new Node();
        n2.data = "Sangayya";

        Node n3 = new Node();
        n3.data = "Hiremath";

        n1.next = n2 ;
        n2.next = n3 ;
        n3.next = null ;

        Node head = n1 ;

        // Traverse the data
        Node temp = head ;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next ;
        }
        System.out.println(" ");
    }
}