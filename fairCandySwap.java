import java.util.*;
public class fairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        //SumA + x - y = SumB - X + y  *solve for y
        // y = x + (sumb - Suma)/2
        int sumA = 0, sumB = 0;
        for(int i : A){
            sumA += i;
        }
        for(int i : B){
            sumB +=i;
        }
        int delta = (sumB - sumA)/2;

        Set<Integer> hash = new HashSet();
        
        for(int i : B){
            hash.add(i);
        }
        for(int x : A){
            if (hash.contains(x + delta)){
                return new int[]  {x,x+delta};
            }
        } 
        throw null;
    }
}
