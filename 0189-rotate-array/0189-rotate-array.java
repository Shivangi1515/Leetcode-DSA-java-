class Solution {
    public void rotate(int[] nums, int k) {

        

        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

        // k=k%n;

        // //store last k elements in temp 
        // int[]temp=new int[k];
        // for(int i=0;i<k;i++){
        //     temp[i]=nums[n-k+i];

        // }
        // //start shifting 
        // for(int i=n-k-1;i>=0;i--){
        //     nums[i+k]=nums[i];
        // }
        // //Now put temp elements at the front
        // for(int i=0;i<k;i++){
        //     nums[i]=temp[i];
        // }






        
    }
    public void reverse(int[]nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}