class Solution {
    public int reverse(int x) {
       int rev = 0;
        while(x != 0){
            int pop = x % 10;
            x /= 10;
            if(rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;        
    }
}
/*
throughout each iteration, divide by 10 to get ones,tens,hundreds,thousands....,etc. We make sure that the 
reverse integer at each iteration is within the bounds with dividing by 10