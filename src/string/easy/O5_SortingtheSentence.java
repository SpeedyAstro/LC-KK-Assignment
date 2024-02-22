package string.easy;

import java.util.Arrays;

public class O5_SortingtheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1));
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, word.length() - 1)).append(" ");
        }
        return sb.toString().trim();
    }
    public String sortSentence1(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];
        for(String word : words){
            int index = word.charAt(word.length()-1)-'0'-1;
            bucket[index] = word.substring(0, word.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String word : bucket){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
