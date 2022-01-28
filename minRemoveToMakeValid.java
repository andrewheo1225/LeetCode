class Solution {
    public String minRemoveToMakeValid(String s) {
        // Pass 1: Remove all invalid ")"
        StringBuilder sb = new StringBuilder();
        int openSeen = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openSeen++;  
                balance++;
            } if (c == ')') {
                if (balance == 0) continue;
                balance--;
            }
            sb.append(c);
        }
        // Pass 2: Remove the rightmost "("
        StringBuilder result = new StringBuilder();
        int openToKeep = openSeen - balance;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(') {
                openToKeep--;
                if (openToKeep < 0) continue;
            }
            result.append(c);
        }
        return result.toString();
    }
}
/*
We do a point system
every '(' increases the balance by 1, while ')' decreases the balance by 1
using this system can find the ) that we don't need. for example A(ND)EW)HEO
it will go from 0 -> 1, 1 -> 0, 0 -> -1
once it goes negative, it means that we found a ) we dont need which we dont add to the string
The next step which is tricky is understanding that the RIGHTMOST '('  is not needed. Can be more than 1 ')'
by finding the number of open '(' and subtracting from the balance at the end of step 1, we find 
how many '('s we can ignore to find the "rightmost (" which we can delete. 
ex:
HEL(LOM)Y)((NAM)(EISAN)DREWHEO
the balance system will delete the ) next to Y 
HEL(LOM)Y((NAM)(EISAN)DREWHEO
the amount of ( we can skip to find the righmost(s) ( will be 4 - 1 = 3
HEL(LOM)Y((NAM)(EISAN)DREWHEO
   1     23    *
HEL(LOM)Y((NAM)EISAN)DREWHEO
correct answer is found!

