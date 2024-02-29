package recursion;

public class Sort {
    public void bubble(int[] arr, int r, int c){
        if (r==0) return;
        if (c<r){
            if (arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r,c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }
    public void selection(int[] arr,int r, int c){
        if (r==0) return;
        if (c<r){
            int maxIndex = getMaxIndex(arr,c,r);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r];
            arr[r] = temp;
            selection(arr,r,c+1);
        }else{
            selection(arr,r-1,0);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Sort obj = new Sort();
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Bubble Sort");
        obj.bubble(arr, arr.length-1, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Selection Sort");
        obj.selection(arr, arr.length-1, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
