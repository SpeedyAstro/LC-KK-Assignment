package searching.easy;

public class O6_ArrangeCoins {
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid == n/mid)
                return mid;
            else if(mid < n/mid)
                left = mid+1;
            else
                right = mid-1;
        }
        return right;
    }
}
