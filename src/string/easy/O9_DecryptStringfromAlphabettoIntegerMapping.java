package string.easy;

import java.util.Arrays;

public class O9_DecryptStringfromAlphabettoIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                sb.append((char)('a'+Integer.parseInt(s.substring(i, i+2))-1));
                i+=2;
            }else{
                sb.append((char)('a'+Integer.parseInt(s.substring(i, i+1))-1));
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        O9_DecryptStringfromAlphabettoIntegerMapping obj = new O9_DecryptStringfromAlphabettoIntegerMapping();
        obj.freqAlphabets("10#11#12");
        obj.freqAlphabets("1326#");
        System.out.println('j'-'a');
    }
}
