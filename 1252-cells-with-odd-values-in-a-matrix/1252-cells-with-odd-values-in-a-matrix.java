class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int[][]matrix=new int[m][n];

        for(int[] index:indices){
            int row=index[0];
            int col=index[1];

            //for incrementing all elements in row

            for(int j=0;j<n;j++){
                matrix[row][j]++;

            }

            //for incrementing all elements in column

            for(int i=0;i<m;i++){
                matrix[i][col]++;

            }
        }

        //for counting odd values after increment
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;


        
    }
}