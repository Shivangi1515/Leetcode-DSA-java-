class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

          List<Integer> luckyNumber=new ArrayList<>();

          int rows=matrix.length;
          int col=matrix[0].length;

          //check for every element
          for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                int element=matrix[i][j];

                boolean isMinInrow=true;
                boolean isMaxIncol=true;

                //check if it is minimum in its row

                for(int k=0;k<col;k++){
                    if(matrix[i][k]<element){
                        isMinInrow=false;
                        break;
                    }
                }
                //check if element is maximum in its column

                for(int k=0;k<rows;k++){
                    if(matrix[k][j]>element){
                        isMaxIncol=false;
                        break;
                    }
                }
                if(isMinInrow && isMaxIncol){
                    luckyNumber.add(element);
                }
            }
          }
          return luckyNumber;

          
        
    }
}