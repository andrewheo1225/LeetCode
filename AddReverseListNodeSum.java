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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode; 
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry = sum / 10;
            ListNode currentSum = new ListNode(sum % 10);
            temp.next = currentSum;
            temp = temp.next;
        }
        return dummyNode.next;
    }
}
/*
Since it is reverse, the answer must be in reverse
we can simply add the current nodes of the l1 and l2
there will be carry which will be the sum / 10. It will either be 1 or 0
Be careful because at the end of the summation, there can be a leading carry(1) which must be added. The "carry == 1"
     in the while loop takes care of that
Time complexity will be the max(m,n);
*/