package string.easy;

public class O17_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        O17_ValidPalindromeII obj = new O17_ValidPalindromeII();
        System.out.println(obj.validPalindrome("aba"));
        System.out.println(obj.validPalindrome("abca"));
    }
}
