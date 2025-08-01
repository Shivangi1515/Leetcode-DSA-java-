class Solution {

    public static boolean canSplit(int[]nums,int k,int max_sum){
        int current_sum=0;
        int parts=1;

        for(int num:nums){
            if(current_sum+num>max_sum){
                parts++;
                current_sum=num;
                if(parts>k){
                    return false;
                }
            }
            else{
                current_sum+=num;
            }
            
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {

        int start=0;
        int end=0;
        int answer=0;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]); 
            end+=nums[i];
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(canSplit(nums,k,mid)){
                answer=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return answer;
        
    }
}