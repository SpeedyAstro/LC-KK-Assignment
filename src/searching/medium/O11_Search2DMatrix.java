package searching.medium;

public class O11_Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0 , c = matrix[0].length-1;
        System.out.println("r :"+r+" c: "+c);
        while(r<matrix.length && c >= 0){
            if(matrix[r][c] == target) return true;
            if(matrix[r][c] < target) r++;
            else c--;
        }
        return false;
    }
}
