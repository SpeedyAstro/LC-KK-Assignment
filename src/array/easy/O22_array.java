package array.easy;

public class O22_array {
    public int[] sumZero(int n) {
        int [] ans = new int[n];
        int h = 0;
        for(int i = 1 ; i <= n/2 ; i++){
            ans[h] = i;
            ans[h+1] = -1*i;
            h+=2;
        }
        return ans;
    }
}