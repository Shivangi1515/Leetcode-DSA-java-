class Solution {
    public static void backtrack(int[]nums,int i,List<Integer>subset,List<List<Integer>>ans){
        //base case
        if(i==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        //recursion
        //include
        subset.add(nums[i]); //add current element 
        backtrack(nums,i+1,subset,ans); 
        //exclude
        subset.remove(subset.size()-1);
        backtrack(nums,i+1,subset,ans);


    }
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>>ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
        
    

        
    }
}