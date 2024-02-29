package array.easy;

public class O25_array {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] array = new int[r][c] ;
        int row = 0 , col = 0;
        if(r*c != mat.length*mat[0].length) return mat;
        for(int[] i : mat){
            for(int j : i){
                array[row][col] = j;
                col++;
                if(col == c){
                    row++;
                    col = 0;
                }
            }
        }
        return array;
    }
}
