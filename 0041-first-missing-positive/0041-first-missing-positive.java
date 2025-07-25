class Solution {
    public static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public int firstMissingPositive(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            }else{
                i++;
            }

        }
        //search for missing positive number
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
        
    }
}