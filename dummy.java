import java.util.*;
public class dummy {
  public static void main(String[] args) {
    int n = 4;
    if(n == 0 || n == 1 || n == 2){System.out.print(n);}
    int[] mem = new int[n];
    mem[0] = 1;
    mem[1] = 2;
    for(int i = 2; i < n; i++){
        mem[i] = mem[i-1] + mem[i-2];
    }
    System.out.print(mem[n-1]); 
    System.out.println();
    for(int i = 0; i < mem.length;i++)
    System.out.print(mem[i] + " ");
    }
}
