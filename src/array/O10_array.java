package array;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
import java.util.Arrays;

public class O10_array {
    public static boolean checkIfPangram(String sentence) {
        char[] str = sentence.toCharArray();
        int [] arr = new int[26];
        String ans = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;

        for (int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-97]++;
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==0) return false;
        }

        System.out.println(Arrays.toString(arr));

        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram(sentence);
    }
}
