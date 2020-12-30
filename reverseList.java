import java.util.*;
public class reverseList {
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
			return head;
		}
		ListNode current = head;
		Stack<Integer> stack = new Stack<>();
		while(current != null){
			stack.add(current.val);
			current = current.next;
		}
		ListNode resultHead= new ListNode(stack.pop());
		ListNode cur = resultHead;
		while (!stack.isEmpty()){
			cur.next= new ListNode(stack.pop());
			cur = cur.next;
		}
		return resultHead;
    }
}
