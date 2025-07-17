class Solution {
    public int diagonalSum(int[][] mat) {

        int n=mat.length;
        int sum=0;

        for(int i=0;i<n;i++){
            //for primary diagonal sum
            sum+=mat[i][i];
            //for secondary diagonal sum
            sum+=mat[i][n-1-i];
        }
        //if matrix has odd size,subtract mat[1][1] from the sum as it has added  twice and duplicacy element sum may occur.

        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
        
    }
}