package deleteme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumSum {
//    task is to find the subarray of array that has maximum sum and if sum is negative then return 0
//    You have an array a
// of n
// integers.
//
//You perform exactly k
// operations on it. In one operation, you select any contiguous subarray of the array a
// (possibly empty) and insert the sum of this subarray anywhere in the array.
//
//Your task is to find the maximum possible sum of the array after k
// such operations.
//
//As this number can be very large, output the answer modulo 109+7
//.
//
//Reminder: the remainder of a number x
// modulo p
// is the smallest non-negative y
// such that there exists an integer q
// and x=p⋅q+y
//.
       public static int maxSubArray(List<Integer> nums) {
              int maxSum = 0;
              int sum = 0;
              for (int i = 0 ; i < nums.size() ; i++){
                sum += nums.get(i);
                if (sum < 0){
                     sum = 0;
                }
                maxSum = Math.max(maxSum,sum);
              }
              return maxSum;
       }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0 ; i < n ; i++){
                list.add(sc.nextInt());
            }
            int maxSum = 0;
            for (int i = 0 ; i < k ; i++){
                maxSum = maxSubArray(list);
                System.out.println("maxSum = " + maxSum);
                list.add(maxSum % 1000000007);
            }
            int sum = 0;
            for (int e : list) {
                e = e % 1000000007;
                sum += e;
            }
            System.out.println(sum);
        }
    }
}
