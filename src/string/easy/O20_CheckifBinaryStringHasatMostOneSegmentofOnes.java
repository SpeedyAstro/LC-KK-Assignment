package string.easy;

public class O20_CheckifBinaryStringHasatMostOneSegmentofOnes {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
                while(i < s.length() && s.charAt(i) == '1'){
                    i++;
                }
            }
        }
        return count == 1;
    }
}
