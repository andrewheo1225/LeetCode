public class Search {
    public static void main(String[] args)
    {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.print(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        while(low != high)
        {
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                mid = mid - 1;
            }
            else if(target > nums[mid]){
                mid = mid + 1;
            }
        }
        return -1;
    }
}
