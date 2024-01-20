package searching.easy;

public class O5_ValidSqr {
    public boolean isPerfectSquare(int num) {
        if(num==0)
            return false;
        int left = 1, right = num;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid == num/mid && num%mid==0)
                return true;
            else if(mid < num/mid)
                left = mid+1;
            else
                right = mid-1;
        }
        return false;
    }
}
