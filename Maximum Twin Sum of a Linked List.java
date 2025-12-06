/*
Leetcode:Maximum Twin Sum of a Linked List
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
    public ListNode reverse(ListNode curr){
        ListNode nxt=null;
        ListNode prev=null;
        
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow);
        int max=Integer.MIN_VALUE;
        while(rev!=null){
            max=Math.max(max,(rev.val+head.val));
            rev=rev.next;
            head=head.next;
        }
        return max;
    }
}
