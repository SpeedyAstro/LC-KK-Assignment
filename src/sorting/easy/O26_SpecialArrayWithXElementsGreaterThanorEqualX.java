package sorting.easy;

import java.util.Arrays;

public class O26_SpecialArrayWithXElementsGreaterThanorEqualX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        return nums[0]-1;
    }
}
