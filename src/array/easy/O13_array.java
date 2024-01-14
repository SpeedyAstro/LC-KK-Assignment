package array;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/
public class O13_array {
        public int[][] flipAndInvertImage(int[][] image) {
            for(int[] bin : image){
                flipMe(bin);
            }
            return image;
        }
        public void flipMe(int[] arr){
            int t = 0;
            int n = arr.length;
            for(int i= 1; i<= (arr.length+1)/2 ; i++) {
                t = arr[n-i] ^ 1;
                arr[n-i] = arr[i-1] ^ 1;
                arr[i-1] = t;
            }
            System.out.println("length :: "+arr.length/2);
            System.out.println(Arrays.toString(arr));
        }
}
