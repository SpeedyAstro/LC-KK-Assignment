package sorting.easy;

import java.util.Arrays;

public class O23_Make2ArrayEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        for(int i = 0; i < target.length; i++){
            count[target[i]]++;
            count[arr[i]]--;
        }
        for(int i = 0; i < 1001; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public boolean canBeEqual1(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0; i < target.length; i++){
            if(target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}
