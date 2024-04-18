package recursion.codingNinza;

public class PalindromString {
    public static boolean isStringPalindrome(String input) {
        return isStringPalindrome(input, 0, input.length() - 1);
    }

    private static boolean isStringPalindrome(String input, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return true;
        }
        if(input.charAt(startIndex) != input.charAt(endIndex)) {
            return false;
        }
        return isStringPalindrome(input, startIndex + 1, endIndex - 1);
    }
    private static boolean isStringPalindrome2(String input, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return true;
        }
        return (input.charAt(startIndex) != input.charAt(endIndex)) ? false : isStringPalindrome2(input, startIndex + 1, endIndex - 1);
    }
    private static boolean isStringPalindrome3(String input) {
        if(input.length() == 0 || input.length() == 1) {
            return true;
        }
        return (input.charAt(0) != input.charAt(input.length() - 1)) ? false : isStringPalindrome3(input.substring(1, input.length() - 1));
    }

    public static void main(String[] args) {
//        System.out.println(isStringPalindrome("racecar"));
        System.out.println(replaceCharacter("abc", 'a', 'x'));
    }

    public static String replaceCharacter(String input, char c1, char c2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(input.length() == 0) {
            System.out.println(input);
            return input;
        }
        String smallOutput = replaceCharacter(input.substring(1), c1, c2);
        if(input.charAt(0) == c1) {
            return c2 + smallOutput;
        } else {
            return input.charAt(0) + smallOutput;
        }
    }
    private static String removeDuplicates(String input) {
        if(input.length() == 0 || input.length() == 1) {
            return input;
        }
        String smallOutput = removeDuplicates(input.substring(1));
        if(input.charAt(0) == input.charAt(1)) {
            return smallOutput;
        } else {
            return input.charAt(0) + smallOutput;
        }
    }
}
