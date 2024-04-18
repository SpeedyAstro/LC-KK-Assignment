package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O18_array {

        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> list = new ArrayList<Integer>();
            int i = num.length-1;
            while(i>=0 || k>0){
                if(i>=0) k+=num[i];
                list.add(k%10);
                k/=10;
                i--;
            }
            Collections.reverse(list);
            return list;
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
