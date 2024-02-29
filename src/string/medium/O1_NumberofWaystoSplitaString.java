package string.medium;

public class O1_NumberofWaystoSplitaString {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        if(s1.length > s2.length){
            String[] temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int i = 0;
        while(i < s1.length && s1[i].equals(s2[i])){
            System.out.println(s1[i] + " " + s2[i]);
            i++;
        }
        System.out.println(i);
        int j = s1.length - 1;
        int k = s2.length - 1;
        while(j >= 0 && k >= 0 && s1[j].equals(s2[k])){
            System.out.println(s1[j] + " " + s2[k]);
            System.out.println(j + " " + k);
            j--;
            k--;
        }
        System.out.println(j);
        return i > j;
    }

    public static void main(String[] args) {
        O1_NumberofWaystoSplitaString obj = new O1_NumberofWaystoSplitaString();
        System.out.println(obj.areSentencesSimilar("i am a boy", "i am very a very good boy"));
    }
}
