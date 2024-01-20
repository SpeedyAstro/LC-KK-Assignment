package searching.easy;

public class O8_KthMissingNumber {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length-1;
        int l = 0, r = len;
        while(l<=r){
            int mid = l + (r-l)/2;
            int missing = arr[mid] - (mid+1);
            if(missing<k) l = mid+1;
            else r = mid - 1;
        }
        return k+r+1;
    }
}
