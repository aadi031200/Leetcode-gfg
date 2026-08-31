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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1;
        int prev=-1;
        
        int min=Integer.MAX_VALUE;
        int max=-1;

        int idx=1;

        ListNode curr=head.next;

        while(curr!=null && curr.next!=null){
            if((curr.val>head.val && curr.val>curr.next.val) || 
            (curr.val<head.val && curr.val<curr.next.val)){
                if(first==-1){
                    first=idx;
                }

                if(prev!=-1){
                    min=Math.min(min,idx-prev);
                }
                prev=idx;

                max=idx-first;
            }

            head=curr;
            curr=curr.next;
            idx++;
        }

        if(first==-1 || first==prev){
            return new int[]{-1,-1};
        }
        return new int[]{min,max};

    }
}