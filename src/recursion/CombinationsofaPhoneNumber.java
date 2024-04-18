package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationsofaPhoneNumber {
    public List<String> letterCombinations2(String digits) {
//        return combination("", digits);
        combination("", digits);
        return letterCombinations1("", digits);
    }

    private void combination(String s, String digits) {
        if (digits.isEmpty()){
            System.out.println(s);
            return ;
        }
        int digit = digits.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char) ('a' + i);
            combination(s+ch, digits.substring(1));
        }
    }
    static int padCount(String s, String up){
        if (up.isEmpty()) return 1;
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char) ('a' + i);
            count += padCount(s+ch, up.substring(1));
        }
        return count;
    }
    public List<String> letterCombinations1(String s,String digits) {
        if (digits.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(s);
            return result;
        }
        int digit = digits.charAt(0) - '0';
        ArrayList<String> result = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++){
            char ch = (char) ('a' + i);
            result.addAll(letterCombinations1(s+ch, digits.substring(1)));
        }
        return result;
    }
    public static void main(String[] args) {
        CombinationsofaPhoneNumber obj = new CombinationsofaPhoneNumber();
        System.out.println(obj.letterCombinations("23"));
        System.out.println(obj.letterCombinations1("", "23"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinationsRecursive(result, digits, "", 0, mapping);
        return result;
    }

    private void letterCombinationsRecursive(List<String> result, String digits, String s, int i, String[] mapping) {
        if (i == digits.length()) {
            result.add(s);
            return;
        }
        String letters = mapping[digits.charAt(i) - '0'];
        for (int j = 0; j < letters.length(); j++) {
            letterCombinationsRecursive(result, digits, s + letters.charAt(j), i + 1, mapping);
        }

    }

}
