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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }

        ListNode head;

        if(list1.val<list2.val){
            head=list1;
            list1 = list1.next;
        }else{
            head=list2;
            list2=list2.next;
        }
        ListNode it = head;
        while(list1 !=null && list2!=null){
            if(list1.val<list2.val){
                it.next=list1;
                list1 = list1.next;
            }else{
                it.next=list2;
                list2=list2.next;
            }
            it = it.next;
        }

        while(list1!=null){
            it.next=list1;
            list1=list1.next;
            it = it.next;
        }
        while(list2 !=null){
            it.next=list2;
            list2=list2.next;
            it=it.next;
        }

        return head;
    }
}