class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int a=nums[i];  

            int b=target-a;

            if(map.containsKey(b)){
                return new int[]{i,map.get(b)};
            }
            map.put(nums[i],i);
        }

        return new int[]{};

    }
}