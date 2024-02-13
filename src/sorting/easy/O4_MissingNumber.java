package sorting.easy;

public class O4_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int ele : nums){
            sum -= ele;
        }
        return sum;
    }
}
