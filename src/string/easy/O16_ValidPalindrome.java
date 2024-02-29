package string.easy;

public class O16_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length()-1;
        while(i<j){
            if(!isPalindrome(s.charAt(i))){
                i++;
            }else if(!isPalindrome(s.charAt(j))){
                j--;
            }else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean isPalindrome(char s){
        if ((s>='a' && s<='z') || (s>='A' && s<='Z') || (s>='0' && s<='9')){
            return true;
        }
        return false;
    }
}
