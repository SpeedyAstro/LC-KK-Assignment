package sorting.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class O4_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key, new java.util.ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new java.util.ArrayList<>(map.values());
    }
}
