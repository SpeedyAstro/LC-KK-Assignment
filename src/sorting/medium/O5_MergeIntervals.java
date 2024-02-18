package sorting.medium;

import java.util.Arrays;
import java.util.Comparator;

public class O5_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        int[] currentInterval = intervals[0];
        int[][] result = new int[intervals.length][2];
        int resultIndex = 0;
        for(int i = 1; i < intervals.length; i++){
            if(currentInterval[1] >= intervals[i][0]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }else{
                result[resultIndex++] = currentInterval;
                currentInterval = intervals[i];
            }
        }
        result[resultIndex] = currentInterval;
        return Arrays.copyOf(result, resultIndex+1);

    }
}
