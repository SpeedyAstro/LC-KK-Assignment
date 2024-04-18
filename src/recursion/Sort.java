package recursion;

public class Sort {
    public int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        return merge(left, right);
    }

    private int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    static void mergeSortInPlace(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSortInPlace(arr, start, mid);
            mergeSortInPlace(arr, mid + 1, end);
            mergeInPlace(arr, start, mid, end);
        }
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (j < mid) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }


    }

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
