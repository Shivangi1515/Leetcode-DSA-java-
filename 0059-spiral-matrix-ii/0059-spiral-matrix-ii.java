class Solution {
    public int[][] generateMatrix(int n) {

        int[][]matrix=new int[n][n];

        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=n-1;

        int num=1;

        while(num<=n*n){  //we have to take the squares of the number as per given matrix

        //for top boundary

            
            for(int j=col_start;j<=col_end;j++){
            matrix[row_start][j]=num++;
        }
        row_start++;

        //for right boundary

        for(int i=row_start;i<=row_end;i++){
            matrix[i][col_end]=num++;
        }
        col_end--;

        //for bottom boundary

        if(row_start<=row_end){
            for(int j=col_end;j>=col_start;j--){
            matrix[row_end][j]=num++;
        }
        row_end--;
        }

        //for left boundary
       if(col_start<=col_end){
        
        for(int i=row_end;i>=row_start;i--){
            matrix[i][col_start]=num++;
        }
        col_start++;
       }


        } 
        return matrix;
        

        
    }
}