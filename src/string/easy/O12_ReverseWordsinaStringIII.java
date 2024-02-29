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

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int columnNumber = 701;
        char c = (char) ((char) columnNumber%26 + 'A' - 1);
        char c1 = (char) 701/26 + 'A' - 1;
        String result = Character.toString(c1) + Character.toString(c);
        System.out.println(result);
        System.out.println((char) 701%26);
        System.out.println((char) 701/26);
        int n = 1;
//        n to char
        System.out.println((char) (n + 'A' - 1));
        String sd = (char) (n + 'A' - 1) + "";
    }
}
