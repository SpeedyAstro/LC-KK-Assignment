package string.medium;

import java.util.HashMap;

public class O5_RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        int count = 1;
        StringBuilder sb = new StringBuilder(a);
        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }
        if(sb.indexOf(b) != -1){
            return count;
        }
        sb.append(a);
        if(sb.indexOf(b) != -1){
            return count+1;
        }
        return -1;
    }
}
