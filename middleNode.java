public class middleNode {
    public ListNode middle(ListNode head) {
       ListNode[] array = new ListNode[100];
       int position = 0;
       while(head.next != null)
       {
        array[position++] = head;
        head = head.next;
       }
       return array[position /2];
    }
}
