import java.util.*;
public class mergeTwoLists {
    public ListNode mergegitTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode answer;
        if(l1.val < l2.val){
          answer = l1;
          answer.next = TwoLists(l1.next,l2);
        }
        else{
            answer = l2;
            answer.next = TwoLists(l1,l2.next);
        }
        return answer;
    } 
}
