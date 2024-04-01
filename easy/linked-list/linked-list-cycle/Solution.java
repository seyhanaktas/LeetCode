/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head !=null){
            if(head.val==(int)Math.pow(10,5)+1){
                return true;
            }
            head.val=(int)Math.pow(10,5)+1;
            head=head.next;
        }
        return false;
    }
}