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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;

        ListNode headNext = head.next;
        head.next=null;
        while(headNext!=null){
            ListNode temp= headNext.next;
            headNext.next= head;
            head=headNext;
            headNext=temp;
        }
        return head;
    }


}