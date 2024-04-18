package array.easy;

import java.util.ArrayList;
import java.util.List;

public class O23_array {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int luck = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            int k = findSmall(matrix[i]);
            boolean flag = true;
            for(int j = 0 ; j < matrix.length; j++){
                if(matrix[i][k]<matrix[j][k]) {
                    flag = false;
                    break;
                }
            }
            if(flag) list.add(matrix[i][k]);
        }
        return list;
    }
    public int findSmall(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = 0;
        // System.out.println
        for(int i =0 ;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println(index);
        return index;
    }
}
