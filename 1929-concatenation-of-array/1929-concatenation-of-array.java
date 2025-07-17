class Solution {
    public int[] getConcatenation(int[] nums) {

        int[]ans=new int[2*nums.length];
        //First Copy
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        //second copy
        for(int i=0;i<nums.length;i++){
            ans[nums.length+i]=nums[i];
        }
        return ans;
        
    }
}