class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> result=new ArrayList<>();
        //finding the maximum candies that kid have
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        //check if each kid can have maximum candies
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
                
            }
            else{
                result.add(false);
            }
        }
        return result;

        
    }
}