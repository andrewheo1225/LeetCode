import java.util.*;

public class isPalindrome {
    public boolean Palindrome(ListNode head) {
        ListNode current = head;
        Stack<Integer> stack = new Stack<Integer>();
        boolean flag = true;
        while(current != null)
        {
            stack.push(current.val);
            current = current.next;
        }
        while(head != null)
        {
           if(head.val != (int)stack.pop())
           {
               flag = false;
           }
           head = head.next;
        }
        return flag;
    }
}
