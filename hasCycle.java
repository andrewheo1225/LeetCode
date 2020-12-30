import java.util.*;

public class hasCycle {
    public boolean Cycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();

        while (head != null) {
            set.add(head);
            head = head.next;
            if (set.contains(head)) {
                return true;
            }
        }
        return false;
    }
}
