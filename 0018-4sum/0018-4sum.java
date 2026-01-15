class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>>st=new HashSet<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Long>set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long fourth=(long)target-sum;
                    if(set.contains(fourth)){
                        List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(temp);
                        st.add(temp);

                    }


                    set.add((long)nums[k]);


                }
            }
        }
        return new ArrayList<>(st);
        
    }
}