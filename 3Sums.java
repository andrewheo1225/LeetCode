class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i] <= 0; i++){
            if(i == 0 || nums[i-1] != nums[i]){
                twoSumsII(nums,i,res);
            }
        }
        return res;
    }
    void twoSumsII(int[] nums, int i, List<List<Integer>> res){
        int lo = i+1;
        int hi = nums.length - 1;
        while(lo < hi){
            int sum = nums[i] + nums[lo] + nums[hi];
            if(sum < 0){
                lo++;
            }else if(sum>0){
                hi--;
            }else{
                res.add(Arrays.asList(nums[i],nums[lo++],nums[hi--]));
                while(lo < hi && nums[lo] == nums[lo-1]){
                    lo++;
                }
            }
        }
        
    }
}
/*
do a sort
use a for loop with three pointers
you only have to use a for loop from negative numbers since positive # + positive # will always equal positive
"i == 0" is simply created to start the "nums[i-1] != nums[i]" which makes sure no duplicates are used
3sum is created by using the 2sum algorithm
since the array is sorted, if the total sum is less than 0, increment lo, and if > 0, decrement hi
if the sum is 0, add it to the answer and make sure to increment lo in a while loop to stop duplicates  