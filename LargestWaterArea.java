class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int shortestOfTwo = Math.min(height[left],height[right]);
            int lengthOfLToR = right - left;
            maxArea = Math.max(maxArea,shortestOfTwo * lengthOfLToR);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
            
        }
        return maxArea;
    }
}

/*
given an array, find the first and last indexes
the area of the array will be the length of the first and last indices mulitpled by the shortest of the two values
move the shorter of the two which means if left<right -> left++ or right<left -> right--
compare each new area with the previous determined max area while the left/right indexes cross over each other.