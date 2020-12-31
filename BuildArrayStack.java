import java.util.*;

public class BuildArrayStack {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<String>();
        int x = 0;
        for (int i = 1; i <= n && x < target.length; i++) {
            answer.add("Push");
            if (target[x] == i)
                x++;
            else
                answer.add("Pop");
        }
        return answer;

    }
}
