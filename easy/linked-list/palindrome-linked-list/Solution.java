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

    public boolean isPalindrome(ListNode head) {
        ListNode it= head;
        int counter=0;

        while(it!=null){
            counter++;
            it = it.next;
        }
        int tailEnd= 0;
        if(counter%2==1)
            tailEnd= (counter +1)/2;
        else
            tailEnd= counter/2;

        it= head;
        int i=0;
        while(i<tailEnd){
            i++;
            it=it.next;
        }

        ListNode tail = null;
        while(it!=null){
            ListNode tail2= tail;
            tail = it;
            it= it.next;
            tail.next= tail2;
        }

        while(tail!=null){
            if(head.val!=tail.val)
                return false;
            head = head.next;
            tail=tail.next;
        }
        return true;
    }
}