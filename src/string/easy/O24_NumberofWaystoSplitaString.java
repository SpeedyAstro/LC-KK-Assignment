package string.easy;

public class O24_NumberofWaystoSplitaString {
    public int numWays(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        if(count % 3 != 0){
            return 0;
        }
        if(count == 0){
            return (int)(((long)(s.length()-1)*(s.length()-2)/2) % 1000000007);
        }
        int first = 0;
        int second = 0;
        int third = 0;
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                temp++;
            }
            if(temp == count/3){
                first++;
            }
            else if(temp == 2*count/3){
                second++;
            }
            else if(temp == count){
                third++;
            }
        }
        return (int)((long)first*second % 1000000007);
    }
}
