package array;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
import java.util.Arrays;

public class O10_array {
    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for(char c : sentence.toCharArray()){
            arr[c-'a']++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i : arr){
            if(i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram(sentence);
    }
}
