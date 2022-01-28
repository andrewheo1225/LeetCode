class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
        int mid = start + (end - start) / 2;
            
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] >= nums[start]){
            if(target < nums[mid] && target >= nums[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        else{
            if(target > nums[mid] && target <= nums[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        }
        return -1;
        
    }
}
/*
Uses one pass binary Search

**
our binary search is based on the array being divided into 2 subarrays. 
Base Case:
Subarray will be continious increasing and/or
Subarray will have continious increasing then a smaller #
Final case: array is not changed which means regular binary search is enough
***

There are two cases:
1.
4 5 6 7 8 |9| 10 11 1 2 3
left subarray is continious increasing, right isn't
Pivot element is larger than the first element in the array(subarray)
we know if target is less than pivot and greater than the first element => end = mid - 1
else => start = mid + 1;

2. 
8 9 10 11 1 |2| 3 4 5 6 7 
right subarray is continious increasing, left isn't
Pivot element is smaller than the first element in the array(subarray)
if target is greater than pivot => start = mid + 1
else => end = mid - 1;
