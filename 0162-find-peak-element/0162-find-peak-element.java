class Solution {
    public int findPeakElement(int[] nums) {

        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]){  //firstly we are in descending part of array
                end=mid;  //this may be the possible ans,but we will check towards left also
            }
            else{
                start=mid+1; //now we are in ascending part of array
            }
        }
        return start;
        
    }
}