class Solution {
    public int maxSubArray(int[] nums) {

        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        ;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){  //if sum goes negative,reset the sum to zero
                sum=0; 
            }
        }
        return maxSum;
        
    }
}