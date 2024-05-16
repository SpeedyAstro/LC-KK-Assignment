package BitsManipulation;

public class Problems {
//    find unique number in array where all numbers are repeated twice except one
    public int findUnique(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
//    find unique number in array where all numbers are repeated thrice except one
    public int findUniqueThrice(int[] nums) {
        int ans = 0;
        int[] count = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < 32; i++) {
            count[i] %= 3;
            if (count[i] == 1) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
//    find unique number in array where all numbers are repeated k times except one
    public int findUniqueKTimes(int[] nums, int k) {
        int ans = 0;
        int[] count = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < 32; i++) {
            count[i] %= k;
            if (count[i] == 1) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
//    find two unique numbers in array where all numbers are repeated twice except two
    public int[] findTwoUnique(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int mask = xor & -xor;
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

}
