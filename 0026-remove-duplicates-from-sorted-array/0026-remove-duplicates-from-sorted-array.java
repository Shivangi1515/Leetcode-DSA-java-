class Solution {
    public int removeDuplicates(int[] nums) {

        //by two pointer method
        
        //we will take two pointer i and j
        //i will keep track of unique elements and j will iterate over the array

        if(nums.length==0){
            return 0;
        }
        int i=0;  //initially suppose unique element is at index 1
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++; 
                nums[i]=nums[j];
            }
        }
        return i+1;

        
    }
}