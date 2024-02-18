package array.easy;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class O14_array {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int [][] ans = new int[m][n];
        for(int[] indice : indices){
            getIncrement(indice,ans);
        }
        for(int [] arr : ans){
            for(int ele : arr){
                if(ele%2!=0) count++;
            }
        }
        return count;
    }
    public void getIncrement(int[] num, int [][] ans){
        int row = num[0];
        int col = num[1];
        for(int i=0;i<ans[row].length;i++){
            ans[row][i]++;
            //System.out.println("row : col " +row+":"+i+" -> "+ans[row][i]);
        }
        for(int i=0;i<ans.length;i++){
            ans[i][col]++;
            //  System.out.println("4 col :: row : col " +i+":"+col+" -> "+ans[i][col]);
        }

    }
}
