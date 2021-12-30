class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = (Integer)(target - nums[i]);
            if(map.containsKey(requiredNum)){
                int[] answer = {(int)map.get(requiredNum) , i };
                return answer;
            }
            map.put(nums[i] , i);
        }
        return null;
    }
}

/*
created a hashmap that linearly goes through the array
we find the requiredNum value which is the requireNum = target - currentVal
through each iteration, if we do not find the keyvalye in the hashmap, we put it into the hashmap
we add the current value of the array and its array position in a key-value set in the map
if we find it, we create a 2 val array and return the array indices
*/