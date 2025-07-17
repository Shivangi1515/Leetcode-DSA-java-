class Solution {
    public void setZeroes(int[][] matrix) {

        int rows=matrix.length;
        int cols=matrix[0].length;
        //set the flags to check if first row or first column have any zero
        boolean firstRowZero=false; 
        boolean firstColZero=false;
        //Now check if first row have any zero  or not,if have set flag to true;
        for(int j=0;j<cols;j++){
            if(matrix[0][j]==0){
                firstRowZero=true;
                break; 

            }
        }
        //Now Check if first column have any zero or not,if have set flag to true;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }
        //Set the first row and first column as markers
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;  //mark row
                    matrix[0][j]=0;  //mark column

                }
            }
        }
        //Use markers to set the inner matrix cells to zero
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //Set the cells of first row to zero if zero found in first row
        if(firstRowZero==true){
            for(int j=0;j<cols;j++){
                matrix[0][j]=0;
            }
        }
        //Set the cells of first column to zero if zero found in first column
        if(firstColZero==true){
            for (int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }




        
    }
}