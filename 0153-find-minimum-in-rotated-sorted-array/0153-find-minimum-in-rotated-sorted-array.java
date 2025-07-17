class Solution {
    public int findMin(int[] nums) {

        int start=0;
        int end=nums.length-1;

        if(nums[start]<nums[end]){  //This condition is when the array is already sorted and
                                    //we will find minimum at first index
            return nums[start];
        }
        while(start<end){
            int mid=(start+end)/2;
            //part where array is not sorted,we get are minimum element
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[end];
        
    }
}