package string.easy;

public class O4_CountItemsMatchingaRule {
    public int countMatches(java.util.List<java.util.List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if(ruleKey.equals("type")){
            index = 0;
        }else if(ruleKey.equals("color")){
            index = 1;
        }else if(ruleKey.equals("name")){
            index = 2;
        }
        int count = 0;
        for(java.util.List<String> item: items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
