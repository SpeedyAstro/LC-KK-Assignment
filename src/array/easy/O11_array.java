package array;

import java.util.List;

public class O11_array {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        int value;
        if(ruleKey.equals("type")) value = 0;
        else if(ruleKey.equals("color")) value = 1;
        else value = 2;
        for(List list : items){
            if(list.get(value).equals(ruleValue))
                count++;
        }
        return  count;
    }
}
