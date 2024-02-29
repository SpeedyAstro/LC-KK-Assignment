package recursion;

public class CheckIfArraySorted {
    public boolean isSorted(int[] arr, int n){
        if(n==1){
            return true;
        }
        return (arr[n-1] < arr[n-2]) ? false : isSorted(arr, n-1);
    }

    public static void main(String[] args) {
        CheckIfArraySorted obj = new CheckIfArraySorted();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(obj.isSorted(arr, arr.length));
    }
}
