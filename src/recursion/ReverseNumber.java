package recursion;

public class ReverseNumber {
    public int reverse(int x) {
        if(x/10==0){
            return x;
        }
        return reverse(x%10) * 10 + reverse(x/10);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        System.out.println(obj.reverse(123));
    }
}
