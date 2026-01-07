class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        int cnt1=0;
        int cnt2=0; 
        int el1=0;
        int el2=0;

        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;

            }

        }
        ArrayList<Integer>result=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]) cnt1++;
            if(el2==nums[i]) cnt2++;
        }
        int n=nums.length;
        int mini=n/3+1;
        if(cnt1>=mini) result.add(el1);
        if(cnt2>=mini && el1!=el2) result.add(el2);

        return result;

       

        
    }
}