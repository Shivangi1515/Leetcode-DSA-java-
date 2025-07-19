class Solution {
    public boolean check(int[] nums) {

        int count=0; //it will keep track of how many times wrong order is found
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
        
    }
}