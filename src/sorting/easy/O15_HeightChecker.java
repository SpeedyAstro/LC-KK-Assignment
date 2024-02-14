package sorting.easy;

public class O15_HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            expected[i] = heights[i];
        }
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                if(expected[i] > expected[j]){
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}
