class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            //Loop through every pair
            for(int j=i+1;j<nums.length;j++){
                //check if sum equals to target
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
            
    }
}