package string.easy;

public class O22_ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        return new StringBuilder(word.substring(0, index+1)).reverse().toString() + word.substring(index+1);
    }
}