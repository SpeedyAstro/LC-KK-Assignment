package sorting.easy;

import java.util.*;
import java.util.stream.IntStream;

public class O25_SortArraybyIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) == map.get(b) ? b-a : map.get(a)-map.get(b));
        int[] res = new int[nums.length];
        int index = 0;
        for(int num: list){
            int freq = map.get(num);
            for(int i=0; i<freq; i++){
                res[index++] = num;
            }
        }
        return res;
    }
}
