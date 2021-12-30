class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String val = String.valueOf(x);
        int start = 0;
        int end = val.length() - 1;
        while(end > start){
            if(val.charAt(end) != val.charAt(start)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}