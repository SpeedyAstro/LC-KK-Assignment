package array.medium;

public class O4_SetMatrixZero {
        public void setZeroes(int[][] matrix) {
            int r=matrix.length,c=matrix[0].length;
            int row0=1,col0=1;

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(matrix[i][j]==0){
                        if(i==0 && j==0){
                            row0=0;
                            col0=0;
                        }
                        else if(j==0)
                            col0=0;
                        else if(i==0)
                            row0=0;
                        else{
                            matrix[i][0]=0;
                            matrix[0][j]=0;
                        }
                    }
                }
            }
            for(int i=1;i<r;i++){
                for(int j=1;j<c;j++){
                    if(matrix[i][0]==0 || matrix[0][j]==0)
                        matrix[i][j]=0;
                }
            }
            if(row0==0){
                for(int col=0;col<c;col++)
                    matrix[0][col]=0;
            }
            if(col0==0){
                for(int row=0;row<r;row++)
                    matrix[row][0]=0;
            }
        }
}
