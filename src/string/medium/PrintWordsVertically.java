package string.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public List<String> printVertically(String s) {
        String[] ss = s.split(" ");
        int max = 0;
        for(String str : ss){
            max = Math.max(max, str.length());
        }
        List<String> res = new ArrayList<>();
for(int i = 0; i < max; i++){
            StringBuilder sb = new StringBuilder();
            for(String str : ss){
                if(i < str.length()){
                    sb.append(str.charAt(i));
                } else {
                    sb.append(" ");
                }
            }
            int j = sb.length() - 1;
            while(j >= 0 && sb.charAt(j) == ' '){
                j--;
            }
            res.add(sb.substring(0, j+1));
        }
        return res;
    }
}
