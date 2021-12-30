class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slow = 0;
        int fast = 0;
        Set<Character> answer = new HashSet<>();
        int maxLength = 0;
        while(fast < s.length()){
            if(!answer.contains(s.charAt(fast))){
                answer.add(s.charAt(fast));
                fast++;
                maxLength = Math.max(maxLength,answer.size());
            }else{
                answer.remove(s.charAt(slow));
                slow++;
            }
        }
        return maxLength;
    }
}
/*
the method is using a window slider with a hashmap
we create a fast pointer that keeps going through the string until a repeated character is met.
Once met, we incrementally remove the characters in the hasmap using the slow pointer until it reaches
the fast pointer
then we repeat this cycle until the string length is met and continuously updating the max length with each 
nonrepeating substring met
**while accepted, it was not very fast. 