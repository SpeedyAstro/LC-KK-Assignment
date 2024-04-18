package recursion;

import java.util.ArrayList;

public class SubSeq {
    static void printSubSeq(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        printSubSeq(input.substring(1), output + input.charAt(0));
        printSubSeq(input.substring(1), output);
    }
    static ArrayList printSubSeqence(String input, String output) {
        if (input.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add(output);
            return res;
        }
        ArrayList<String> res1 = printSubSeqence(input.substring(1), output + input.charAt(0));
        ArrayList<String> res2 = printSubSeqence(input.substring(1), output);
        res1.addAll(res2);
        return res1;
    }

    public static void main(String[] args) {
        printSubSeq("abada", "");
        System.out.println(printSubSeqence("bcbbbcba", ""));
    }
}
