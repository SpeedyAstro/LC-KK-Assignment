package array;
//https://leetcode.com/problems/concatenation-of-array/
public class O2_easy {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length*2];
        for(int i=0;i<length*2;i++){
            ans[i] = nums[i%length];
        }
        return ans;
    }
}
