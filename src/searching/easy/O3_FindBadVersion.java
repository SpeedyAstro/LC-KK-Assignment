package searching.easy;

public class O3_FindBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid))
                right = mid-1;
            else
                left = mid+1;
        }
        return left;
    }
    public boolean isBadVersion(int n){
        return true;
    }
}
