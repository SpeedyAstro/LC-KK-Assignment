package recursion.codingNinza;

public class FindIndexInArray {
    public static int firstIndex(int input[], int x) {
        return firstIndex(input, x, 0);
    }

    private static int firstIndex(int input[], int x, int startIndex) {
        if(startIndex == input.length) {
            return -1;
        }
        if(input[startIndex] == x) {
            return startIndex;
        }
        return firstIndex(input, x, startIndex + 1);
    }

    public static void main(String[] args) {
        int input[] = {9, 8, 10, 8};
        System.out.println(firstIndex(input, 8));
    }
}
