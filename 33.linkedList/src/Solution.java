/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.* ;

class Solution {
    public FindDuplicate.ListNode deleteDuplicates(FindDuplicate.ListNode head) {
        HashMap<Integer , Integer> map = new HashMap<>();

        FindDuplicate.ListNode temp = head ;

        while(temp != null){
            if(map.containsKey(temp.val)){
                map.put(temp.val , map.get(temp.val) + 1) ;
            } else {
                map.put(temp.val , 1);
            }
            temp = temp.next ;
        }

        FindDuplicate.ListNode dummy = new FindDuplicate.ListNode(0);
        FindDuplicate.ListNode curr = dummy ;

        temp = head ;
        while(temp != null){
            if(map.get(temp.val) == 1){
                curr.next = new FindDuplicate.ListNode(temp.val);
                curr = curr.next ;
            }
            temp = temp.next;
        }

        return dummy.next ;
    }
}