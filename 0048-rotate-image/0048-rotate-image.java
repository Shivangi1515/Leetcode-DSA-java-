class Solution {
    public void rotate(int[][] matrix) {

        int n=matrix.length;

        //Transpose the matrix
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        //Reverse the row
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;

                start++;
                end--;

                
            }
        }
        
    }
}