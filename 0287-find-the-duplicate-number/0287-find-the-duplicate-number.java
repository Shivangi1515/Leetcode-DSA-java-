class Solution {

    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correctindex=nums[i]-1;
                if(nums[i]!=nums[correctindex]){
                    swap(nums,i,correctindex);
                }
                else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
        
    }
}