package graph.ques;

public class FloodFillAlgorithm {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int firstColor = image[sr][sc];
        if (firstColor != color) {
            return floodFillUtil(image, sr, sc, firstColor, color);
        }
        return image;
    }

    public int[][] floodFillUtil(int[][] image, int sr , int sc , int firstColor, int newColor){
        if (sc < 0 || sr < 0 || sc >= image[0].length || sr >= image.length || image[sr][sc] != firstColor) {
            return image;
        }
        image[sr][sc] = newColor;
        floodFillUtil(image, sr + 1, sc, firstColor, newColor);
        floodFillUtil(image, sr - 1, sc, firstColor, newColor);
        floodFillUtil(image, sr, sc + 1, firstColor, newColor);
        floodFillUtil(image, sr, sc - 1, firstColor, newColor);
        return image;
    }

}
