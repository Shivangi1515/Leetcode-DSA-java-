class Solution {
    public int maximumWealth(int[][] accounts) {
       int max_sum=0;
       for(int i=0;i<accounts.length;i++){
        int rowsum=0;
        for(int j=0;j<accounts[i].length;j++){
            
            rowsum+=accounts[i][j];

        }
        if(rowsum>max_sum){
            max_sum=rowsum;
        }
        
       }
       return max_sum;
        
    }
}