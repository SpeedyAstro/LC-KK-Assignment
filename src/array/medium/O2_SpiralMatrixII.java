package array.medium;

public class O2_SpiralMatrixII {
        public int[][] generateMatrix(int n) {
            int [][] arr = new int[n][n];
            int col_left = 0 , col_rgt = n-1;
            int rom_up = 0 , rom_down = n-1;
            int count = 1;
            while(count <= n*n) {
                for (int i = col_left; i <= col_rgt; i++) {
                    arr[rom_up][i] = count;
                    count++;
                }
                rom_up++;
                for(int i = rom_up ; i <= rom_down; i++){
                    arr[i][col_rgt] = count;
                    count++;
                }
                col_rgt--;
                if(rom_up<=rom_down){
                    for(int i = col_rgt ; i >= col_left; i--){
                        arr[rom_down][i] = count;
                        count++;
                    }
                }
                rom_down--;
                if(col_left<=col_rgt){
                    for(int i = rom_down ; i >= rom_up ; i--){
                        arr[i][col_left] = count;
                        count++;
                    }
                }
                col_left++;
            }
            return arr;
        }
}
