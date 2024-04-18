package recursion;

public class Main {
    static void print1ToN(int n) {
        if(n==0){
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
    }
    static void printNto1(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    static int productOfN(int n) {
        if(n==1){
            return 1;
        }
        return n*productOfN(n-1);
    }
    static int sumOfN(int n) {
        if(n==1){
            return 1;
        }
        return n+sumOfN(n-1);
    }
    static int power(int n, int p) {
        if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
    static int sumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
    static int productOfDigits(int n) {
        if(n==0){
            return 1;
        }
        return n%10*productOfDigits(n/10);
    }
    static int reverse(int n) {
        if(n==0){
            return 0;
        }
        return (n%10)*((int)Math.pow(10,(int)Math.log10(n)))+reverse(n/10);
    }
    static boolean isPalindrome(int n) {
        return n==reverse(n);
    }
    static int countZeros(int n) {
        if(n==0){
            return 0;
        }
        return (n%10==0?1:0)+countZeros(n/10);
    }


}
