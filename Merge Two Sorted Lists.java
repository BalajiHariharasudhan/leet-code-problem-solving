/* Leetcode:Merge Two Sorted Lists
    Leetcode id:https://leetcode.com/problems/merge-two-sorted-lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
    if(list1==null) return list2;
    if(list2==null) return list1;
     
        ListNode temp=list1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=list2;
        ListNode curr=list1;
        boolean swap=true;
        while(swap){
            swap=false;
            curr=list1;
            while(curr.next!=null){
                if(curr.val>curr.next.val){
                    int t=curr.next.val;
                    curr.next.val=curr.val;
                    curr.val=t; 
                    swap=true;
                }
                curr=curr.next;
            }
        }
        return list1;



    }
}
