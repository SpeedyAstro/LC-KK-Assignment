package sorting.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class O18_RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0; i<temp.length; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], rank);
                rank++;
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
