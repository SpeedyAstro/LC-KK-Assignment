package sorting.easy;

import java.util.Arrays;

public class O13_LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int a = nums[0], b = nums[1];
        // System.out.println(Arrays.toString(nums));
        for(int i = 2 ; i < nums.length ; i++){
            // System.out.println(isTrianglePossible(a,b,nums[i]));
            if(isTrianglePossible(a,b,nums[i])){
                max = Math.max(max,a+b+nums[i]);
            }
            a = b;
            b = nums[i];
        }
        return max;

    }
    public static boolean isTrianglePossible(int a, int b, int c) {
        // System.out.println(a+" " +b+ " "+c);
        return a + b > c || (a==b) && (b==c);
    }
}
