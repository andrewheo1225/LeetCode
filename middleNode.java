public class middleNode {
    public ListNode middle(ListNode head) {
       public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr.next != null){
            fastptr = fastptr.next;
            slowptr = slowptr.next;
            if(fastptr.next == null)break;
            fastptr = fastptr.next;
        }
        return slowptr;
    }
}
