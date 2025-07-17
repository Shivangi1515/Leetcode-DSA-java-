class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        //We have to take 4 variables for 4 boundaries of a matrix

        int row_start=0;
        int row_end=matrix.length-1;
        int col_start=0;
        int col_end=matrix[0].length-1;

        List<Integer>result=new ArrayList<>();

        while(row_start<=row_end && col_start<=col_end){

            //For the Top Boundary

            for(int j=col_start;j<=col_end;j++){

                result.add(matrix[row_start][j]);
                
            }
            row_start++;
            //for the right boundary
            for(int i=row_start;i<=row_end;i++){
                result.add(matrix[i][col_end]);
            }
            col_end--;
            //for bottom boundary
            if(row_start<=row_end){  
                for(int j=col_end;j>=col_start;j--){
                result.add(matrix[row_end][j]);
            }
            row_end--;
        }
            
            //for left boundary

            if(col_start<=col_end){
                for(int i=row_end;i>=row_start;i--){
                result.add(matrix[i][col_start]);
            }
            col_start++;
            }

        } 
        return result;       
    }
}