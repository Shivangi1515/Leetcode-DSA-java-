class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0; //current count of consecutive ones

        int maxcount=0; //maximum number of consecutive ones found so far

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=0;
            }
        }
        return maxcount;
    }
}