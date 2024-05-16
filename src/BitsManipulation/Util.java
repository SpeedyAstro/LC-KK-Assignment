package BitsManipulation;

public class Util {
    public static void main(String[] args) {
        Util math = new Util();
        System.out.println(math.add(5, 3));
        System.out.println(math.subtract(5, 3));
        System.out.println(~5);
        System.out.println(math.countSetBits(5));
        System.out.println(math.rightmostSetBit(8));
        System.out.println(math.logBase2(8));
        System.out.println(math.reverseBits(8)); // 1


    }
//    Addition of two numbers
    public int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
//    Subtraction of two numbers
    public int subtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }
//    Even or Odd
    public boolean isEven(int n) {
        return (n & 1) == 0;
    }
//    Even or Odd using right shift
    public boolean isEvenRightShift(int n) {
        return (n >> 1) << 1 == n;
    }
//    Multiply by 2
    public int multiplyBy2(int n) {
        return n << 1;
    }
//    Divide by 2
    public int divideBy2(int n) {
        return n >> 1;
    }
//    Multiply by power of 2
    public int multiplyByPowerOf2(int n, int power) {
        return n << power;
    }
//    Divide by power of 2
    public int divideByPowerOf2(int n, int power) {
        return n >> power;
    }
//    Check if ith bit is set
    public boolean isIthBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }
//    Set ith bit
    public int setIthBit(int n, int i) {
        return n | (1 << i);
    }
//    Unset ith bit
    public int unsetIthBit(int n, int i) {
        return n & (~(1 << i));
    }
//    Toggle ith bit
    public int toggleIthBit(int n, int i) {
        return n ^ (1 << i);
    }
//    Turn off the rightmost set bit
    public int turnOffRightmostSetBit(int n) {
        return n & (n - 1);
    }
//    Turn on the rightmost unset bit
    public int turnOnRightmostUnsetBit(int n) {
        return n | (n + 1);
    }
//    Check if a number is power of 2
    public boolean isPowerOf2(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }
//    Find the rightmost set bit
    public int rightmostSetBit(int n) {
        return (int) (Math.log(n & -n) / Math.log(2)) + 1;
    }
//    Find the rightmost unset bit
    public int rightmostUnsetBit(int n) {
        return rightmostSetBit(~n);
    }
//    Check if a number is a power of 4
    public boolean isPowerOf4(int n) {
        return n != 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
    }
//    Swap two numbers
    public void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
//    Find the maximum of two numbers
    public int max(int a, int b) {
        return a ^ ((a ^ b) & -((a < b) ? 1 : 0));
    }
//    Find the minimum of two numbers
    public int min(int a, int b) {
        return b ^ ((a ^ b) & -((a < b) ? 1 : 0));
    }
//    Find the absolute value of a number
    public int abs(int n) {
        return (n ^ (n >> 31)) - (n >> 31);
    }
//    Find the log base 2 of a number
    public int logBase2(int n) {
        return (int) (Math.log(n) / Math.log(2));
    }
//    number of bits
    public int countDigits(int n){
        return (int)(Math.log(n) / Math.log(2)) + 1;
    }
//    check if a number is a palindrome
    public boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == n;
    }
//    reverse bits
    public int reverseBits(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse << 1;
            if ((n & 1) == 1) {
                reverse = reverse ^ 1;
            }
            n = n >> 1;
        }
        return reverse;
    }
//    swap odd and even bits
    public int swapOddEvenBits(int n) {
        return ((n & 0xAAAAAAAA) >> 1) | ((n & 0x55555555) << 1);
    }
//    count number of set bits
    public int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
//
}
