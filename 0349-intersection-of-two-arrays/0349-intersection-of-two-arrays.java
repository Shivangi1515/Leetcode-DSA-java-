class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;

        int i=0;
        int j=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer>intersect=new ArrayList<>();

        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                //to avoid the duplicates
                if(intersect.size()==0 || intersect.get(intersect.size()-1)!=nums1[i] ){
                    intersect.add(nums1[i]);
                }
                i++;
                j++;
            }else{
                if(nums1[i]<nums2[j]){
                    i++;

                }
                else{
                    j++;
                }
            }
        }
        int[]result=new int[intersect.size()];
        for(int k=0;k<intersect.size();k++){
            result[k]=intersect.get(k);
        }
        return result;
        
    }
}