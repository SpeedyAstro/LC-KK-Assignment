package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O18_array {

        public List<Integer> addToArrayForm(int[] num, int k) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            reverse(num);
            int sum = 0;
            for(int i=0;i<num.length;i++){
                sum = num[i] + k%10;
                arr.add(sum%10);
                k/=10;
                k += sum/10;
            }
            while(k!=0){
                arr.add(k%10);
                k/=10;
            }
            Collections.reverse(arr);
            return arr;
        }
        public void reverse(int[] arr){
            int start = 0, end = arr.length-1;
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

}
