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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> nodes =new ArrayList<ListNode>();

        ListNode node= head;

        while(node!=null){
            nodes.add(node);
            node=node.next;
        }

        if(nodes.size()==n){
            head= head.next;
        }else if(n==1){
            node= nodes.get(nodes.size()-n-1);
            node.next=null;;
        }else{
            node= nodes.get(nodes.size()-n);
            node.val=node.next.val;
            node.next=node.next.next;
        }

        return head;
    }
}