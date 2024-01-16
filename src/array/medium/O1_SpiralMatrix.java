package array.medium;

import java.util.ArrayList;
import java.util.List;

public class O1_SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            int col_lft = 0 , col_rgt = matrix[0].length-1;
            int row_up = 0 , row_dwn = matrix.length-1;
            List<Integer> list = new ArrayList<>();

            while((col_lft <= col_rgt) && (row_up <= row_dwn)){
                for(int i = col_lft ; i <= col_rgt ; i++ ){
                    list.add(matrix[row_up][i]);
                }
                row_up++;
                for(int i = row_up ; i <= row_dwn; i++){
                    list.add(matrix[i][col_rgt]);
                }
                col_rgt--;
                if(row_dwn>= row_up) {
                    for (int i = col_rgt; i >= col_lft; i--) {
                        list.add(matrix[row_dwn][i]);
                    }
                }
                row_dwn--;
                if(col_lft<=col_rgt){
                    for(int i = row_dwn ; i >= row_up ; i--){
                        list.add(matrix[i][col_lft]);
                    }
                }
                col_lft++;
            }
            return list;
        }
}
