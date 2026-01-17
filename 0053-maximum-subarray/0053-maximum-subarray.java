class Solution {
    public int maxSubArray(int[] nums) {
        
        int n=nums.length;
        int curr_sum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<n;i++){

            curr_sum=Math.max(curr_sum+nums[i],nums[i]);
            maxSum=Math.max(curr_sum,maxSum);

        }
        return maxSum;
        
    }
}