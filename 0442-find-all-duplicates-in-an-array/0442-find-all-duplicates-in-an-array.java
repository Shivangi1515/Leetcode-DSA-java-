class Solution {

    static void swap(int[]nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer>duplicates=new ArrayList<>();

        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                swap(nums,i,correctindex);
            }
            else{
                i++;
            }
        
    }
    //Now collect duplicates
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            duplicates.add(nums[j]);

        }
    }
    return duplicates;
}
}