package hashmap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num : nums){
            if (!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                max = Math.max(max, currentStreak);
            }
        }
        return max;
    }
}
