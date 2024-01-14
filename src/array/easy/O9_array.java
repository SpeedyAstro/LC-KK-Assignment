package array;
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/
public class O9_array {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] ans = new int [nums.length];
        int max = -1;
        int count = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[0]==0) count++;
            if(ans[index[i]]!=0 || count>1){
                for(int j=max;j>=index[i];j--){
                    ans[j+1] = ans[j];
                }
                ans[index[i]] = nums[i];
                max++;
            }
            else if(ans[index[i]]==0){
                ans[index[i]] = nums[i];
                max = Math.max(max,index[i]);
            }
        }
        return ans;
    }
}
