package recursion.codingNinza;

public class NumberOfDigits {
    public static int countDigits(int n){
        // Write your code here.
        if(n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public void print1ToN(int n){
        // Write your code here.
        if(n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");
    }
}
