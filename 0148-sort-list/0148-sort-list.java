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
    public ListNode sortList(ListNode head) {
        //basic condition
        if(head==null || head.next == null){
            return head;
        }
        //find mid
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next!= null){
            prev = slow;
            fast =fast.next.next;
            slow = slow.next;

        }
        prev.next = null;
        ListNode left = sortList(head);//left node 
        ListNode right = sortList(slow);//right node 

      ;
    return merg(left, right);
        

    }
   
    
    //functio of merge
    private ListNode merg( ListNode left, ListNode right){
        ListNode dammy = new ListNode(-1);
        ListNode pammy = dammy;
        while(left!=null && right !=null){
            if(left.val<=right.val){
                pammy.next = left;

                left = left.next;
            }
            else{
                pammy.next = right;
                right = right.next;
            }
            pammy = pammy.next;

        }
        while(left!=null){
            pammy.next = left;
            left =left.next;
            pammy = pammy.next;

        }
     while(right!=null){
            pammy.next = right;
            right = right.next;
            pammy = pammy.next;
        }
        return dammy.next;

    }
    
    
}