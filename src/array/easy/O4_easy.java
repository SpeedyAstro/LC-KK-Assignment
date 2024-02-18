package array.easy;
//https://leetcode.com/problems/richest-customer-wealth/submissions/941373989/
public class O4_easy {
    public int maximumWealth(int[][] accounts) {
        int max = -1,sum=0;
        for(int i = 0 ; i < accounts.length;i++){
            for(int j = 0 ; j<accounts[i].length;j++){
                sum += accounts[i][j];
                max = Math.max(sum,max);
            }
            sum = 0;
        }
        return max;
    }
    public int maximumWealth1(int[][] accounts) {
        int rich = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int amount : account){
                sum += amount;
            }
            if(sum>rich) rich = sum;
        }
        return rich;
    }
}
