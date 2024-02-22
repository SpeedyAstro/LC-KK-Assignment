package string.easy;

public class O12_ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }
}
