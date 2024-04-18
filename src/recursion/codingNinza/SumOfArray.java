package recursion.codingNinza;

public class SumOfArray {
    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(input.length == 0) {
            return 0;
        }
        int smallInput[] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        return input[0] + sum(smallInput);

    }
}
