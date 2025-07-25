class Solution {
    public int search(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(target==nums[mid]){
                return mid;
            }
            //search in left sorted array
            else if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            //search in right sorted array
            else{
                if(target<=nums[end] && target>nums[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
           
        }
        return -1;

    }
}
