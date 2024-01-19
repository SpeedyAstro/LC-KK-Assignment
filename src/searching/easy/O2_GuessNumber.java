package searching.easy;

public class O2_GuessNumber {
    public int guessNumber(int n) {
      int left = 1, right = n;
      while(left<=right){
          int mid = left + (right-left)/2;
          if(guess(mid)==0)
              return mid;
          else if(guess(mid)==-1)
              right = mid-1;
          else
              left = mid+1;
      }
      return -1;
    }
    public int guess(int num){
        return 0;
    }
}
