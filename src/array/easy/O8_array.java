package array;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class O8_array {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int [] ans = new int [nums.length];
            int i = 0;
            for(int num: nums){
                int count = 0;
                for(int check : nums){
                    if(num>check) count++;
                }
                ans[i++] = count;
            }
            return ans;
        }

}
