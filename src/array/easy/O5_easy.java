package array;
//https://leetcode.com/problems/shuffle-the-array/description/
public class O5_easy {
    public int[] shuffle(int[] nums, int n) {
        int count = 0 ;
        int [] ans = new int[nums.length];
        for(int i = 0 ; i < n ; i++){
            ans[count++] = nums[i];
            ans[count++] = nums[n+i];
        }
        return ans;
    }
    public int[] shuffle1(int[] nums, int n) {
        int ans [] = new int[2*n];
        int j = n;
        for(int i = 0 ; i <n ; i++){
            ans[i*2] = nums[i]; // 0 , 2, 4
            ans[i*2+1] = nums[j];//1,3,5
            j++;
        }
        return ans;
    }
}
