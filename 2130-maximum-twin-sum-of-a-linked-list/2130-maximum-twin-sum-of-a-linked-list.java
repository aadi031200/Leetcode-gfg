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
    public int pairSum(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         ListNode curr=slow;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode slow1=head;
        ListNode fast1=prev;

        int ans=Integer.MIN_VALUE;

        while(fast1!=null){
            ans=Math.max(ans,slow1.val+fast1.val);
            slow1=slow1.next;
            fast1=fast1.next;
        }
        return ans;

    }
}