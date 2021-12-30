class Solution {
    public String longestPalindrome(String s) {
    if (s == null || s.length() < 1){
     return "";
    }
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);
        int len2 = expandAroundCenter(s, i, i + 1);
        int len = Math.max(len1, len2);
        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;
}
}
/*
we must go through every letter of the string
there are two cases for palindromes:
    1. "racecar", there is a letter at the center of the palindrome
    2. "abba"  there isn't a letter at the center of the palindrome
we must call the method twice which starts from the "center" and expands left && right simultaniously
Only one of the two cases will be correct which len gets the max value of both
the if statement in the while loop, is basically everytime a new substring that is a palindrome and LONGER
then the previous one, the startIndex and the endIndex gets updated
Finally, return the string of the startIndex and endIndex which gives the longest palindromic substring