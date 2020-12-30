import java.util.*;
public class getDecimalValue {
    public int getDecimalValue(ListNode head) {
     int total = 0;
     while(head != null)
     {
        total<<=1;
        total += head.val;
        head = head.next;

     }
     return total;
        
    }

}
