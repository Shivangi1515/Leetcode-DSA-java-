class Solution {
    public int[] shuffle(int[] nums, int n) {

        //By two pointer method
        //in nums=[2,5,1,3,4,7]
        // for  x part i.e [2,5,1] where we will use pointer i
        // for y part i.e [3,4,7] where we will use pointer j
        // and for res array we will use k as index to store value in that array
       

        int[]res=new int[2*n];
        int i=0;   
        int j=n;
        int k=0;
        while(i<n && j<2*n){
            res[k++]=nums[i++];
            res[k++]=nums[j++];

        }
        return res;
        
    }
}