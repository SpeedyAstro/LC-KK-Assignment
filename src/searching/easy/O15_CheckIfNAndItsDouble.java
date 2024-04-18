package searching.easy;

public class O15_CheckIfNAndItsDouble {
    public boolean checkIfExist(int[] arr) {
//        using binary search
        for(int i=0;i<arr.length;i++){
            int left = 0, right = arr.length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(arr[mid] == 2*arr[i] && mid!=i)
                    return true;
                else if(arr[mid] < 2*arr[i])
                    left = mid+1;
                else
                    right = mid-1;
            }
        }
        return false;
    }
}
