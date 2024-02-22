package string.easy;

import java.util.Arrays;

public class O8_DetermineifStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;
        for(int i=0; i<n/2; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(n/2+i))){
                count--;
            }
        }
        return count == 0;
    }
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
