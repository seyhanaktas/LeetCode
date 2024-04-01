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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=null;
        ListNode it=new ListNode();
        ListNode prev=null;
        root = it;
        int remainder = 0;
        while(l1!=null && l2!=null){
            int val = remainder+l1.val+l2.val;
            it.val=val%10;
            remainder = val/10;
            it.next = new ListNode();
            prev = it;
            it = it.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int val = remainder+l1.val;
            it.val=val%10;
            it.next = new ListNode();
            prev = it;
            it = it.next;
            remainder = val/10;
            l1=l1.next;
        }
        while(l2!=null){
            int val = remainder+l2.val;
            it.val=val%10;
            it.next = new ListNode();
            prev = it;
            it = it.next;
            remainder = val/10;
            l2=l2.next;
        }
        if(remainder ==0)
            prev.next =null;
        else
            prev.next.val = remainder;
        return root;
    }
}