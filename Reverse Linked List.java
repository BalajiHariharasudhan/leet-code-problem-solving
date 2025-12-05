/*
Leetcode:Reverse Linked List
*/
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
        if(head==null){
            return null;
        }
        else{
            ListNode curr=head;
            ListNode nxt=null;
            ListNode prev=null;
            while(curr!=null){
                nxt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nxt;
            }
            head=prev;
        }
        return head;
    }
}
