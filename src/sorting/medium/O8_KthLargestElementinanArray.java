package sorting.medium;

public class O8_KthLargestElementinanArray {
    public int findKthLargest(int[] arr, int k) {
        int last = 0,maxIndex = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            last = arr.length - i - 1;
            maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
            count++;
            if (count == k) {
                return arr[last];
            }

        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
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
}
